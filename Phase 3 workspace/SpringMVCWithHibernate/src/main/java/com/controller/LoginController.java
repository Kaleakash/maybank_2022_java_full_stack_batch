package com.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bean.Login;
import com.service.LoginService;
@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "checkLoginDetails",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req, Login ll) {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ll.setEmail(email);
		ll.setPassword(password);
		
		String result = loginService.signIn(ll);
		ModelAndView mav = new ModelAndView();
	
		if(result.equals("success")) {
				mav.setViewName("success.jsp");
		}else {			
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
