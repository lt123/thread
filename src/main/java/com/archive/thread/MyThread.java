package com.archive.thread;

/**
 * Hello world!
 *
 */
public class MyThread extends Thread {
	
	private int number = 5;

	@Override
	public synchronized void run() {
		number--;
		System.out.println(MyThread.currentThread().getName() + " : " + number);
	}
	
    public static void main( String[] args )
    {
    	MyThread myThread = new MyThread();
    	
    	Thread t1 = new Thread(myThread,"t1");
    	Thread t2 = new Thread(myThread,"t2");
    	Thread t3 = new Thread(myThread,"t3");
    	Thread t4 = new Thread(myThread,"t4");
    	Thread t5 = new Thread(myThread,"t5");
    	
    	t1.start();
    	t2.start();
    	t3.start();
    	t4.start();
    	t5.start();
    	
    }
}
