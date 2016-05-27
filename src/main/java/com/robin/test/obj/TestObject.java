package com.robin.test.obj;

public class TestObject {
	public static void main(String[] args) {
//		new TestObject().testEquals();
//		 System.out.println("-------------------------------------");
//		 new TestObject().testFinalize();
		// System.out.println("-------------------------------------");
		 new TestObject().testHashCode();
		 System.out.println("-------------------------------------");
		 new TestObject().testToString();

		Integer s1 = new Integer(3);
		Integer s2 = new Integer(3);
		Integer s3 = new Integer(300); 
		Integer s4 = new Integer(300); 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s2));
		
		String aa = "asd";
		String bb = new String("asda");
		System.out.println(aa.equals(bb));
		
//		String a = "123";
//		String b = "123";
//		System.out.println(a == b);
//
//		Stu s1 = new Stu();
//		Stu s2 = new Stu();
//		System.out.println("s1==s2:" + (s1 == s2));
//		System.out.println("s1.equals(s2):" + (s1.equals(s2)));
//
//		String s3 = new String("111");
//		String s4 = new String("111");
//
//		System.out.println(s3.intern() == s4.intern());
//
//		Integer c = 225;
//		Integer d = 225;
//		System.out.println("c==d" + (c == d));
//		System.out.println("c==d --- "
//				+ (c.toString().intern() == d.toString().intern()));
//
//		String e = "ab" + "cd";
//		String f = "abcd";
//		System.out.println("e==f:" + (e == f));
//
//		String m = "aa";
//		String n = "bb";
//		String mn = m + n;
//		String ab = "aabb";
//		System.out.println("mn==ab:"+(mn==ab));
//
//		String x = "a";
//		String y = "bb" + x;
//		String xy = "bba";
//		System.out.println("y==xy:"+(y==xy));
//		
//		final String xx = "a";
//		String yy = "bb" + xx;
//		String xxyy = "bba";
//		System.out.println("yy==xxxyy:"+(yy==xxyy));
//		
//		Object obj = new Object();
		
	}

	// 1、equals()方法：
	public void testEquals() {
		String s1 = new String("aaa");
		String s2 = new String("bbb");
		String s3 = "ccc";
		String s4 = "ccc";
		String s5 = "ddd";
		System.out.println(s3.toString());
		System.out.println(s5.toString());
		System.out.println("-----");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println("-----");
		if (s3 == s4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	// 2、finalize()方法：
	public void testFinalize() {
		for (int i = 0; i < 100; i++) {
			Person2 p = new Person2();
			for (int j = 0; j < 1000; j++) {
				String[] test = { "abc", "eft", "java" };
			}
		}
	}

	// 3、hashCode()方法：
	public void testHashCode() {
		Person p1 = new Person(18);
		Person p2 = new Person(18);
		int handlel = p1.hashCode();

		System.out.println("1." + handlel);
		System.out.println("2." + Integer.toHexString(handlel));
		System.out.println("3." + p1);
		System.out.println("4." + p2.hashCode());
	}

	// 4、toString()方法：
	public void testToString() {
		Person p1 = new Person(18);
		System.out.println(p1.hashCode());
		System.out.println(p1);
		System.out.println(p1.toString());
	}

	class Person {
		private int age;

		public Person() {
			System.out.println("创建一个Person对象");
		}

		public Person(int age) {
			this.age = age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void finalize() {
			System.out.println("对象被销毁");
		}
	}

	class Person2 {
		private int age;

		public Person2() {
			System.out.println("创建一个Person对象");
		}

		public Person2(int age) {
			this.age = age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void finalize() {
			System.out.println("对象被销毁");
		}
	}
}
