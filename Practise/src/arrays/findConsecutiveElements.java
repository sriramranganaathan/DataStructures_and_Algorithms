package arrays;

import java.util.Arrays;

public class findConsecutiveElements {
    // find length of largest consecutive array elements
    public static int getConsecutiveElements(int[] arr) {
        //inputarray = [100, 4, 3, 5, 1, 2, 30, 50, 102, 101]
        //output = 5 (1, 2, 3, 4, 5)
        display(arr);
        int size = 0, count = 0;
        for(int i=0; i<arr.length; i++) {
            if(i>0 && arr[i] == (arr[i-1] + 1)) {
                count++;
            }
            else {
                count = 1;
            }
           size = Math.max(size, count);
        }
        return size;
    }
    static void display(int[] n)
    {
        for(int i=0; i<n.length;i++)
            System.out.print(n[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 3, 5, 1, 2, 30, 50, 101, 102, 103};
        Arrays.sort(arr);
        System.out.println(getConsecutiveElements(arr));
    }
}
