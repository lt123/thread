package com.archive.thread;

public class DirtyRead {
	private String name = "admin";
	private String pswd = "123456";
	
	public synchronized void setVal(String name,String pswd) {
		try {
			this.name = name;
			Thread.sleep(2000);
			this.pswd = pswd;
			System.out.println("set>>>name = " + name + ",pswd = " + pswd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void  getVal() {
		System.out.println("getval>>>name = " + name + ",pswd = " + pswd);
	}
	
	public static void main(String[] args) throws Exception {
		final DirtyRead dirtyRead = new DirtyRead();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				dirtyRead.setVal("key", "val");
			}
		});
		t1.start();
		Thread.sleep(1000);
		dirtyRead.getVal();
		
	}
}
