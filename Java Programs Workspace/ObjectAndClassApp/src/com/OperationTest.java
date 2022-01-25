package com;
class Operation {
	int a,b,sum;
	// Empty 						This task perform only one time 		fixed value 
	public Operation() {
		a=10;
		b=20;
	}
	// parameterized constructor. 			This task perform only one time. dynamic value 
	public Operation(int x, int y) {
		a=x;
		b=y;
	}
	void setValue(int x, int y) {				// this code we can call again and again 
		a=x;
		b=y;
	}
	void add() {
		sum = a+b;
	}
	void display() {
		System.out.println("Sum is "+sum);
	}
}
public class OperationTest {
	public static void main(String[] args) {
	Operation op1 = new Operation(); op1.add(); op1.display();
	Operation op2 = new Operation(); op2.add(); op2.display();
	Operation op3 = new Operation(); op3.setValue(100, 200); op3.add(); op3.display();
	Operation op4 = new Operation(); op4.setValue(1, 2);  op4.setValue(4, 5);op4.add(); op4.display();
	Operation op5 = new Operation(11,22);
	op5.add();
	op5.display();
	}

}
