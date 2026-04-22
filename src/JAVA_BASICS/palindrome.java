package JAVA_BASICS;

public class palindrome {

    public static void main(String[] args) {

        String p = "abbac";
        char[] ab = p.toCharArray();
        boolean ispalindrome = false;
        int left = 0;
        int right = ab.length - 1;

        while (left < right) {
            if (ab[left] == ab[right]) {
                ispalindrome = true;
            } else {
                ispalindrome = false;
            }
            left++;
            right--;
        }
        if (ispalindrome == true) {
            System.out.println("String is palindrome");

        }
        else {
            System.out.println(" string is not palindrome");
        }
    }
}
