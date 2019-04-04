package com.problems.array;

import java.util.Arrays;

public class SortBinaryArrayInLinearTime {
	
	//fill first number of zeros and then ones
	public static void sortBinaryArray(int[] a){
		int zeros = 0;
		for(int i=0; i<a.length; i++){
			if(a[i]==0){
				zeros++;
			}
		}
		
		int k=0;
		while(zeros--!=0){
			a[k++]=0;
		}
		
		while(k<a.length){
			a[k++]=1;
		}
	}
	
	//sort by pushing ones to last
	public static void sortArray(int[] a){
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==0){
				a[k++]=0;
			}
		}
		while(k<a.length){
			a[k++]=1;
		}
	}
	
	//sort by swapping the elements
	public static void sortUsingOneAsPivot(int[] a){
		int j=0;
		int p=1;
		for(int i=0;i<a.length;i++){
			if(a[i]<p){
				swap(a,i,j);
				j++;
			}
		}
	}
	
	//swap function
	public static void swap(int[] a,int i,int j){
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public static void main(String[] args){
		int[] a={1,0,0,1,0,1,1,0,1,0,0};
		sortArray(a);
		System.out.println(Arrays.toString(a));
	}

}
