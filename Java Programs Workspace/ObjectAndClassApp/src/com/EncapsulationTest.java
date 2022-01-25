package com;
class Emp {
	private int id;
	private String name;
	private float salary;
	void setValue(int id, String name, float salary) {
					this.id = id;		// this.id is instance variable and id is local variable
					this.name = name;
					//salary = salary1;
					if(salary<0) {
						this.salary = 8000;
					}else {
						this.salary = salary;
					}
	}
	void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}

public class EncapsulationTest {
	public static void main(String[] args) {
		//System.out.println(id);
		//display();
		Emp emp1 = new Emp();
		emp1.setValue(100, "Lex", -12000);
		//emp1.id=100;
		//emp1.name="Lex";
		//emp1.salary=-15000;
		emp1.display();
	}

}
