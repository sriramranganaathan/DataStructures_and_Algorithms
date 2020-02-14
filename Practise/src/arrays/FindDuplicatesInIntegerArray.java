package arrays;

public class FindDuplicatesInIntegerArray {
	
	public static void findDupplicates(int[] array){
		int[] arrayWithoutDuplicates = new int[array.length];
		int previous = array[0];
		for(int i=1; i<array.length; i++){
			if(previous != array[i])
				arrayWithoutDuplicates[i]=array[i];
			previous = array[i];
			System.out.println(arrayWithoutDuplicates[i]);
		}
		//System.out.println(arrayWithoutDuplicates);
	}
	
	public static void main(String args[]){
		int[] duplicateArray = {1, 6, 6, 7, 9, 0, 5};
		findDupplicates(duplicateArray);
	}

}
