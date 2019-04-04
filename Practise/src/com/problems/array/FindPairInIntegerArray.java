package com.problems.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairInIntegerArray {
	
	
	//time complexity = O(n^2)
	public static void findPair(int[] a, int sum){
		int length = a.length;
		for(int i=0; i<length-1; i++){
			for(int j=i+1; j<length; j++){
				if(a[i]+a[j]==sum){
					System.out.println("Pair found: "+ a[i]+","+a[j]);
				}
			}
		}
	}
	
	//time complexity = O(nlog(n))
	public static void findPairBySortingAndCompare(int[] a, int sum){
		int low = 0;
		int high = a.length-1;
		
		Arrays.sort(a);
		while(low < high){
			if(a[low]+a[high]==sum){
				System.out.println("pair found at index "+low+" and "+high);
			}
			
			if(a[low]+a[high]<sum){
				low++;
			}
			else{
				high--;
			}
		}
	}
	
	//time complexity = O(n)
	public static void findPairUsingHashMap(int[] a, int sum){
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++){
			if(map.containsKey(sum-a[i])){
				System.out.println("pair found at "+i+" and "+map.get(sum-a[i]));
				return;
			}
			map.put(a[i], i);
		}
		System.out.println("pair not found");
	}
	
	
	public static void main(String[] args){
		int arr[]={2,3,5,8,6};
		findPairUsingHashMap(arr, 9);
	}

}
