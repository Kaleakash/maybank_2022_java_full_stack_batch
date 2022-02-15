package abc;
interface A{
		void dis1();
}
class B implements A {
	public void dis1() {
		System.out.println("dis1() method override in B class");
	}
	public void dis2() {
		System.out.println("B class dis2() method");
	}
}
public class Test {
	public static void main(String[] args) {
		//A obj1 = new A();
		B obj2  = new B();	obj2.dis1();  obj2.dis2();
		A obj3 = new B(); 	obj3.dis1();  //obj3.dis2();
	}
}
