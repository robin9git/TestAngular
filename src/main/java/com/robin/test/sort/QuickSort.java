package com.robin.test.sort;

public class QuickSort {

	public static void quickSort(int[] arr,int low,int high){
		if(low<high){
			int i = low;
			int j = high;
			int temp = arr[i];
			while(i<j){
//				while(temp>arr[j]){
//					arr[i] = arr[j];
//					i++;
//				}
				while(i<j&&temp<=arr[j]){
					j--;
				}
				if(i<j){
					arr[i] = arr[j];
					i++;
				}
				while(i<j&&temp>arr[i]){
					i++;
				}
				if(i<j){
					arr[j] = arr[i];
					j--;	
				}
			}
			arr[i] = temp;
			quickSort(arr, low, j-1);
			quickSort(arr, i+1, high);
		}
//		quickSort(arr, 0, j-1);
//		quickSort(arr, i+1, arr.length-1);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,9,6,3,7,2,4,8,1,6,8,15,2};
		quickSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
