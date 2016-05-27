package com.archive.thread;

public class MultiThread {
	
	private static Integer num = 0;
	
	public static synchronized void printNum(String tag) {
		try {
			if("a".equals(tag)) {
				num = 100;
				System.out.println("tag a>>>>");
				Thread.sleep(1000);
			}else {
				num = 200;
				System.out.println("tag b>>>");
			}
			System.out.println("tag = " + tag + " : " + num);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		final MultiThread m1 = new MultiThread();
		final MultiThread m2 = new MultiThread();
		
		/*Thread t1 = new Thread(new Runnable() {
			public void run() {
				m1.printNum("a");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				m2.printNum("b");
			}
		});
		t1.start();
		t2.start();
*/
		/*	Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				m1.printNum("a");
			}
		};
		Runnable t2 = new Runnable() {
			
			@Override
			public void run() {
				m2.printNum("b");
			}
		};
		t1.run();
		t2.run();*/
	}
}
