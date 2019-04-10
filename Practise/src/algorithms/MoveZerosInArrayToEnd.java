package algorithms;

import java.util.Arrays;

public class MoveZerosInArrayToEnd {
	
	public static void moveZerosToEnd(int A[]){
		int k=0;
		for(int i:A){
			if(i!=0){
				A[k++]=i;
			}
		}
		for(int j=k;j<A.length;j++){
			A[j]=0;
		}
	}
	
	public static void main(String[] args){
		int A[]={2,0,8,7,0,6,0,5,0};
		moveZerosToEnd(A);
		System.out.println(Arrays.toString(A));
	}

}
