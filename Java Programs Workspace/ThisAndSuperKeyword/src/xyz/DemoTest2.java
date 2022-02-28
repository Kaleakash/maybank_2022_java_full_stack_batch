package xyz;
class Employee {
		public Employee() {
			this(100);
			System.out.println("Employee class object created");
		}
		public Employee(int x) {
			System.out.println(" Employee parameter constructor");
		}
}
class Manager extends Employee{
		public Manager() {
			//super(100);
			this(100);
			System.out.println("Manager class object created");
		}
		public Manager(int x) {
			System.out.println("Manager parameter constructtor");
		}
}
public class DemoTest2 {
	public static void main(String[] args) {
		Manager mgr = new Manager();
	}
}
