package com.archive.thread;

public class MyObject {
	
	//同步锁
	public synchronized void method01(){
		System.out.println(Thread.currentThread().getName() + ">>01");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void method02(){
		System.out.println(Thread.currentThread().getName() + ">>02");
	}
	
	public static void main(String[] args) {
		final MyObject object = new MyObject();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				object.method01();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				object.method02();
			}
		});
		
		t1.start();
		t2.start();
	}
	
}
