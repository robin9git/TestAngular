package com.robin.test;

public class TestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer f1 =100,f2=100,f3=150,f4=150;
		System.out.println(f1==f2);
		System.out.println(f3==f4);
		
		String a="123";
		String b=new String("123");
		String c = new String("123");
		
		System.out.println(a==b);
		System.out.println(c==b);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}

}
