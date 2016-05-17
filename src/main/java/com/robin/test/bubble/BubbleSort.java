package com.robin.test.bubble;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = {9,3,5,20,6,11,7};
		int[] arr = {10,9,8,20,6,5,4};
		boolean flag = true;
		int m = 0;
		int n = 0;
		
		for(int i=arr.length;i>1&&flag;i--){
//			for(int i=arr.length;i>1;i--){
			flag= false;
			for(int j=0;j<i-1;j++){
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
				m++;
			}
			n++;
		}
		System.out.print(m +" ");
		System.out.println("----------");
		System.out.print(n + " ");
		System.out.println("-----------------");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
}
