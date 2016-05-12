package com.robin.test.volati;

import java.util.concurrent.CountDownLatch;

public class TestVolatile {

	private static volatile int a = 0;
//	private static int a = 0;
	
	static class vola{
		static int b = 0;
	}
	
	public static void inc(CountDownLatch cdl){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a++;
		
		vola.b++;
		cdl.countDown();//计算完成，计数器减1
	}
	
	
	public static void gogogo(){
		final CountDownLatch cdl = new CountDownLatch(10000);
		for(int i=0;i<10000;i++){
//			cdl.
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
//					a++;
					inc(cdl);
				}
			}).start();
			
		}
		
//		try {
////			Thread.sleep(1000*10);
//			Thread.sleep(1000*2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			cdl.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("a:"+a);
		System.out.println("b:"+vola.b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =10;
		for(int i=0;i<sum;i++){
			gogogo();
		}
//		CountDownLatch cdl = new CountDownLatch(1000);
		
//		for(int i=0;i<10000;i++){
////			cdl.
//			new Thread(new Runnable() {
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
////					a++;
//					inc();
//				}
//			}).start();
//			
//		}
//		
//		try {
////			Thread.sleep(1000*10);
//			Thread.sleep(1000*2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("a:"+a);
//		System.out.println("b:"+vola.b);
		
	}

}
