package mno;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	void color() {
		System.out.println("Red");
	}
	void speed() {
		System.out.println("90km/hr");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
	Honda hh = new Honda();		// using hh overrided method as well as sub class own method. 
		hh.speed();
	hh.color();
	Bike bb = new Honda();		// Run time polymorphism 
	bb.speed();
	}
}
