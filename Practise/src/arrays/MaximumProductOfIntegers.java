package arrays;

import java.util.Arrays;

public class MaximumProductOfIntegers {
	
	public static void findMaximumProduct(int A[]){
		int maxProduct = Integer.MIN_VALUE;
		int iMax = -1;
		int jMax = -1;
		
		for(int i=0;i<A.length-1;i++){
			for(int j=i+1;j<A.length;j++){
				if(maxProduct<A[i]*A[j]){
					maxProduct = A[i]*A[j];
					iMax = A[i];
					jMax = A[j];
				}
			}
		}
		System.out.println("Two Numbers are "+iMax+" and "+jMax);
	}
	
	public static void findMaxProductWithSorting(int A[]){
		int n = A.length;
		Arrays.sort(A);
		if(A[0]*A[1]<A[n-1]*A[n-2]){
			System.out.println("Two numbers are "+A[n-1]+" and "+A[n-2]);
		}
		else{
			System.out.println("Two numbers are "+A[0]+" and "+A[1]);
		}
	}
	
	public static void main(String[] args){
		int[] A = {-10,-3,5,6,-2};
		findMaximumProduct(A);
		findMaxProductWithSorting(A);
	}

}
