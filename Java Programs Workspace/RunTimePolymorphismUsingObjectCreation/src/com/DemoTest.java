package com;
interface Abc {				// abstract class Abc // you can write method with body 
		public int add(int x, int y);					
}
interface Xyz {						// abstract class Xyz 
		public int sub(int x, int y);
}
class Server implements Abc,Xyz {
	public int add(int x, int y) {
		return x+y;
	}
	public int sub(int x, int y) {
		return x-y;
	}
	public void ownMethod() {
		System.out.println("Server own method");
	}
}
public class DemoTest {
	public static void main(String[] args) {
		Server ss = new Server();
		System.out.println(ss.add(10, 20));
		System.out.println(ss.sub(100, 50));
		ss.ownMethod();
				Abc obj1 = new Server();	// with help of obj1 we can call only Abc interface methods.
		System.out.println(obj1.add(100, 200));
		//System.out.println(obj1.sub(300,200));
				Xyz obj2 = new Server();		// with the help of object2 w can call only Xyz interfac methods. 
		System.out.println(obj2.sub(20,10));
		//System.out.println(obj2.add(1,2));
	}

}
