package com;
class Bike {
	final void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
//	void speed() {
//		System.out.println("80km/hr");
//	}
}
class Activa extends Honda {
	
}
public class DemoTest {

	public static void main(String[] args) {
		final int a=10;
		System.out.println(a);
		//a=20;
		System.out.println(a);
		Honda hh = new Honda();
		hh.speed();
	}

}
