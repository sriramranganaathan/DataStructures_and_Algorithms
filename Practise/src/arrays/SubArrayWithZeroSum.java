package arrays;

public class SubArrayWithZeroSum {
    public static boolean findSubArrayWithZeroSum(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            int sum = arr[i];
            if(sum==0) {
                return true;
            }
            for(int j=i+1; j<arr.length; j++) {
                sum += arr[j];
                if(sum==0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -5, 9, 5};
        System.out.print(findSubArrayWithZeroSum(arr));
    }
}
