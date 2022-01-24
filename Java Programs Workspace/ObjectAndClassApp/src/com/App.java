package com;

public class App {

	public static void main(String[] args) {
			Car innova = new Car();
			innova.start();
			innova.appliedGear();
			innova.moving();
			innova.stop();
			//System.out.println(wheel);
			System.out.println("Innova Car Details");
			System.out.println("Wheel "+innova.wheel);
			System.out.println("Color "+innova.color);
			System.out.println("Price" +innova.price);
			innova.wheel=4;
			innova.color="Gray";
			innova.price=2000000;
			System.out.println("After set property value");
			System.out.println("Wheel "+innova.wheel);
			System.out.println("Color "+innova.color);
			System.out.println("Price" +innova.price);
			Car bmw = new Car();
			bmw.start();
			bmw.appliedGear();
			bmw.moving();
			bmw.stop();
			System.out.println("Bmw Car Details");
			System.out.println("Wheel "+bmw.wheel);
			System.out.println("Color "+bmw.color);
			System.out.println("Price" +bmw.price);
			bmw.wheel=4;
			bmw.color="White";
			bmw.price=7500000;
			System.out.println("Wheel "+bmw.wheel);
			System.out.println("Color "+bmw.color);
			System.out.println("Price" +bmw.price);
	}

}
