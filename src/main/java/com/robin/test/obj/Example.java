package com.robin.test.obj;

public class Example {

	String str = new String("good");
	char[] ch = {'a','b','c'};
	
	public void change(String str,char[] ch){
		str = "test ok";
		ch[0] = 'g';
		this.str = "aaa";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		ex.change(ex.str, ex.ch);
		System.out.println("ex.str:"+ex.str);
		System.out.println("ex.ch:"+ex.ch[0]);
		
	}

}
