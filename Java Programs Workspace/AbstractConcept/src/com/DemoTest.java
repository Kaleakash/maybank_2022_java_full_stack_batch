package com;
abstract class Bike {
	abstract void speed();
	void mailage( ) {
		System.out.println("50km/l");
	}
}
abstract class Honda extends Bike {	
		abstract void design();
		void color() {
			System.out.println(" Black ");
		}
}
class SuperHonda extends Honda {
			void speed() {
				System.out.println(" 140km/hr");
			}
			void design() {
				
			}
}
class Pulsar extends Bike {
	void color() {
		System.out.println(" Red ");
	}
	void speed() {							 
		System.out.println(" 110km/hr ");
	}
}
public class DemoTest {
	public static void main(String[] args) {
			//Honda hh = new Honda();		hh.speed();  hh.color();
			Pulsar pu = new Pulsar();    pu.speed();  pu.color();  pu.mailage();
	}
}
