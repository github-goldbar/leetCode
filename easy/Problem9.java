ass Solution {
    static int reversedNumber;
    
    public static boolean isIntPalindrome (int x){
    
        if (x < 0 || x % 10 == 0) {
            return false;
        }

        reversedNumber = 0;
        while (x > reversedNumber) {

            reversedNumber = (reversedNumber * 10) + (x % 10);
            x = x / 10;
        }

        return x == reversedNumber || x == reversedNumber / 10;
    }
}
