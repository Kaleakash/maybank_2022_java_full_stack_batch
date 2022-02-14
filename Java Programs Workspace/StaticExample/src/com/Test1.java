package com;
class Sample {
		int a;					// instance variable 
		static int b;			// static variable only one copy 
		void dis1() {
			System.out.println("a "+a);
			System.out.println("b "+b);
		}
}
class Sample1 {
	int a;						// instance or heap memory 
	static int b;				// only one static memory 
	static int c;
}
public class Test1 {					// static memory 
	public static void main(String[] args) {
		Sample s1 = new Sample();	// heap memory 
		Sample s2 = new Sample();
		Sample1 s3 = new Sample1();	// heap memory
					s1.a=10;
						s1.b=20;
							Sample.b=30;
								s2.a=40;
									s2.b=50;
									Sample.b=60;
		s1.dis1();				// a=10, b=60
		s2.dis1();				// a=40, b=60
	}

}
