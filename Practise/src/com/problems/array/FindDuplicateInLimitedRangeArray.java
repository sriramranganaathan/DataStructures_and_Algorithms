package com.problems.array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInLimitedRangeArray {

	//O(n^2)
	public static void findDuplicate(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("Duplicate:"+a[i]);
				}
			}
		}
	}
	
	//Using hashmap
	public static void findDuplicateUsingHasmap(int a[]){
		Map<Integer,Integer> hashmap = new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(hashmap.containsKey(a[i])){
				System.out.println("Duplicate:"+a[i]);
			}
			else{
				hashmap.put(a[i], i);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] a={1,2,4,5,2,6,1,7};
		findDuplicateUsingHasmap(a);

	}

}
