package com.problems.array;

public class MaximumProductOfTwoIntegers {
	
	public static void findMaxProductOfNumbers(int A[]){
		int maxProductValue=Integer.MIN_VALUE;
		int max_i=-1;
		int max_j=-1;
		
		for(int i=0;i<A.length-1;i++){
			for(int j=i+1;j<A.length;j++){
				if(maxProductValue<A[i]*A[j]){
					maxProductValue=A[i]*A[j];
				}
				else{
					max_i=A[i];
					max_j=A[j];
				}
			}
		}
		System.out.println("Maximum product of numbers is with "+max_i+" and "+max_j);
	}
	
	public static void main(String[] args){
		int[] A={-10, -3, 5, 6, -2};
		findMaxProductOfNumbers(A);
	}

}
