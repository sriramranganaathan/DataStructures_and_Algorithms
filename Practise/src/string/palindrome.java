package string;

class Palindrome {
    public static boolean checkIfPalindromeUsingReversal(String givenString) {
        String reversedString = "";
        for(int i=givenString.length()-1; i>=0; i--) {
            reversedString = reversedString + givenString.charAt(i);
        }
        if(reversedString.equals(givenString)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkIfPalindromeUsingPointer(String givenString) {
        int i = 0, j= givenString.length()-1;
        while(i!=j) {
            if(givenString.charAt(i) != givenString.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(checkIfPalindromeUsingPointer("ababc"));
    }
}