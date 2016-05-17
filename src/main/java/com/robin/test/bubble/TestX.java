package com.robin.test.bubble;

public class TestX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int []aa=new int[]{2,22,15,1,14};
		int[] aa = new int[] { 5, 4, 2, 22, 15, 1, 14, 0, 3 };
		int temp = 0;
		for (int i = 0; i < aa.length; i++) {
			for (int j = aa.length - 1; j > i; j--) {
				if (aa[i] > aa[j]) {
					temp = aa[j];
					aa[j] = aa[i];
					aa[i] = temp;
				}
			}
		}
		for (int f = 0; f < aa.length; f++) {
			System.out.println(aa[f]);
		}

	}

}
