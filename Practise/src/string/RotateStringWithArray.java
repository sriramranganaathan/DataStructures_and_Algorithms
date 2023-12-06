package string;

public class RotateStringWithArray {
    private static String sentence = "This is a Car";
    //Rotate the string as "Car a is This"
    public static void rotateString(String s) {
        String[] strArray = s.split(" ");
        for (int i = strArray.length-1; i>=0; i--) {
            System.out.print(strArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        rotateString(sentence);
    }
}
