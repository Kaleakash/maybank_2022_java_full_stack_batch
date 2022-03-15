package com;
class Booking implements Runnable {
	int avl=1;
	public  synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
	}
}
public class DemoTest1 {
	public static void main(String[] args) {
												// default thread name is main
	Booking bb = new Booking();		// avl=1
	//Booking bb1 = new Booking();		// avl=1
	//Booking bb2 = new Booking();		// avl=1
	Thread t1 = new Thread(bb);
	Thread t2 = new Thread(bb);
	Thread t3 = new Thread(bb);
	t1.setName("Chang");
	t2.setName("Ong");
	t3.setName("Rozana");
	t1.start();
	t2.start();
	t3.start();
	}

}
