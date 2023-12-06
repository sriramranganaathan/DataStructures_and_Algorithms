package arrays;

public class WavePatternFromTwoDArray {
    //    "[{1,2,3}
//    {7,8,9}]""
//    {4,5,6}
//    "Output required is a wave pattern like 1 4 7 8 5 2 3 6 9"
    public static void printWavePattern(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<col; i++) {
            if (i%2 == 0) {
                for(int j=0; j<row; j++) {
                    System.out.print(arr[j][i] + " ");
                }
            }
            else {
                for(int j=row-1; j>=0; j--) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        printWavePattern(arr);
    }
}
