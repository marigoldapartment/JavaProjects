package palindrome;

public class MyPalindrome {
    public static void main(String[] args) {

        int palindrome = 12321;
        String s = palindrome + "";
        String p = "";
        int j = 0;
        for (int i = 1; i <= s.length(); i++) {
            j = palindrome % 10;
            palindrome = palindrome / 10;
            p = p + j;

        }

        if (s.equals(p)) {
            System.out.println("it is palindrom");
        } else {
            System.out.println("it is not palindrom");
        }
    }
}