package arrays;

public class ArrayRotation {
	
	public static void rotateArray(int[] ar, int d){
		int temp[] = new int[d];
		int tempp[] = new int[ar.length-d];
		int result[] = new int[ar.length];
		int k=0;
		for(int i=0;i<d;i++){
			temp[i]=ar[i];
			//System.out.println(temp[i]);
		}
		
		System.out.println("********************");
		
		for(int j=d;j<ar.length;j++){
			tempp[k]=ar[j];
			//System.out.println(tempp[k]);
			k++;
		}
		
		System.arraycopy(tempp, 0, result, 0, tempp.length);
		System.arraycopy(temp, 0, result, tempp.length, temp.length);
		
		for(int i=0;i<result.length;i++){
		System.out.println(result[i]);
		}
	}
	
	public static void main(String args[]){
		int[] arr = {1,5,7,2,3,8};
		rotateArray(arr, 2);
	}

}
