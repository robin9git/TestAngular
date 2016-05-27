package com.robin.test.sort;

public class StraightSelectSort {

	public static void straightSelectSort(){
		int[] arr = {5,89,25,4,56,3,5,7,5,1,2};
		
		for(int i = 0;i<arr.length;i++){
			int k = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[k]>arr[j]){
					k = j;
				}
			}
			if(k!=i){
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		straightSelectSort();
	}

}
