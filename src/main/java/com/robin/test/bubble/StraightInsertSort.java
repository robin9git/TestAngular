package com.robin.test.bubble;

public class StraightInsertSort {
	
	public static void insertSort(){
		
		int[] arr = {5,3,6,89,26,3,75,4,6,1};
		
		for(int i=1;i<arr.length;i++){
			int temp = arr[i],j;
			for(j=i-1;j>-1&&temp<arr[j];j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertSort();
	}

	
}
