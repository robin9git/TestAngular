package com.robin.test.bubble;

public class ShellSort {

	public static void shellSort(){
		int[] arr = {3,5,9,7,6,1,4,8,2,2};
		
		for(int delt = arr.length/2;delt>=1;delt/=2){
			for(int j=delt;j<arr.length;j++){
				int temp = arr[j];
				int k = j-delt;
				while(k>=0&&temp<arr[k]){
					arr[k+delt]=arr[k];
					k-=delt;
				}
				arr[k+delt]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shellSort();
	}
	
}
