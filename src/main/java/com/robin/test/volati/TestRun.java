package com.robin.test.volati;

public class TestRun {

	public static int i=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(i<20){
					
				}
				
			}
		}).start();
		
	}

}
