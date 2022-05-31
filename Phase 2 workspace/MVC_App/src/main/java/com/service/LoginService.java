package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	
	public String createLoginDetails(Login login) {
		LoginDao ld = new LoginDao();
		if(ld.creteLoginDetails(login)>0) {
			return "Account created";
		}else {
			return "Account didn't create";
		}
		
	
	}
}
