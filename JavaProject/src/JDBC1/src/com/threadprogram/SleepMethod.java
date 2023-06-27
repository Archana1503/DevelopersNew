package com.threadprogram;

public class SleepMethod implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			String s=Thread.currentThread().getName();
			System.out.println(s);
			//run method doesnot throws any exception..it   gives InterruptedException; 
			
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			}
	}

	public static void main(String[] args) {
		SleepMethod s=new SleepMethod();
		Thread t=new Thread(s,"Cassical music playing");
		t.start();
		Thread t2=new Thread(s,"Jazz music playing");
		t2.start();

	}

}
