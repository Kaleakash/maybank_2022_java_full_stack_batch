package com;

public class Car {
			// state or variable 
			int wheel;
			String color;
			float price;
			
			// behaviour 
			void start() {
				String msg="Welcome";
				System.out.println(wheel);
				System.out.println(msg);
				System.out.println("Car Started...");
			}
			void appliedGear() {
				int temp=123;
				System.out.println(temp);
					System.out.println("Applied Gear");
			}
			void moving() {
					System.out.println("Car is moving");
			}
			void stop() {
				System.out.println("Car stop");
			}
			
}
