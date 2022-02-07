package com;
class Bike {
	void speed() {
		System.out.println("80km/hr");
	}
}
class Honda extends Bike {					// re-usability of speed() method 
		void color() {
			System.out.println(" Black ");
		}
}
class Pulsar extends Bike {
	void color() {
		System.out.println(" Red ");
	}
	void speed() {							// override the speed method 
		System.out.println(" 110km/hr ");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println(" Gray ");
	}
	void speed() {
		super.speed();								// super class code + sub class method code as merge 
		System.out.println("20km/hr");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
	Honda hh = new Honda();		hh.speed();   hh.color();
	Pulsar pu = new Pulsar();      pu.speed();  pu.color();
	Tvs tvs = new Tvs(); 				tvs.speed();  tvs.color();
	}
}
