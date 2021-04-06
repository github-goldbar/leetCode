package Array.PalindromeNumber.wyn;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char[] chars = str.toCharArray();
        int i = 0;
        if(str.length() == 1){
            return true;
        }
        for (int j = str.length() - 1; j > 0; j--) {
            if (i < str.length() - 1) {
                if (chars[i] == chars[j]) {
                    i++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(7897));
    }
}
