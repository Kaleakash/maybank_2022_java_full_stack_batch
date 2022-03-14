package com;

public class DefaultThreadInfo {

	public static void main(String[] args) {
			Thread t = Thread.currentThread();
			System.out.println(t);
			t.setName("My Thread");
			System.out.println(t);
			t.setPriority(10);
			System.out.println(t);
	}

}
