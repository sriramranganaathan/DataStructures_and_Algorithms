package arrays;

public class MinimumAndMaximumNumbers {
    public static int getMinOfArray(int[] arr) {
        int minValue = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }
    public static int getMaxOfArray(int[] arr) {
        int maxValue = arr[0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {9,4,6,55,99};
        System.out.println(getMinOfArray(arr));
        System.out.println(getMaxOfArray(arr));
    }
}
