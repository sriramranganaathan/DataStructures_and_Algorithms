package com.problems.array;

public class FindSubArraysWithZeroSum {
	
	public static void findSubArrays(int[] a){
		for(int i=0;i<a.length;i++){
			int sum = 0;
			
			for(int j=i;j<a.length;j++){
				sum+=a[j];
				
				if(sum==0){
					System.out.println("sub array "+i+".."+j);
				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		int[] a = {4,2,-3,-1,0,4};
		findSubArrays(a);

	}

}
