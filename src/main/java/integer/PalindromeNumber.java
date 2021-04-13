package integer;

//problem 9
public class PalindromeNumber{

  static int thisManyIntIsPalindrome;
  static int reversedNumber;
  static StringBuffer numberToString = new StringBuffer();
  static String reversedString;

  public static void main(String []args){
    //    Example 1:

    //    Input: x = 121
    //    Output: true


    //    Example 2:

    //    Input: x = -121
    //    Output: false
    //    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


    //    Example 3:
    //
    //    Input: x = 10
    //    Output: false
    //    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


    //    Example 4:
    //
    //    Input: x = -101
    //    Output: false

    int startNumber = 0;
    int endNumber = 2001;

    System.out.printf("From %d to %d, %d number is palindrome",startNumber, endNumber, howManyIntIsPalindrome (startNumber, endNumber));


    System.out.println("isPalindrome(0) = " + isPalindrome(1234567899));
  }

  //method to check if int is Palindrome
  public static boolean isPalindrome (int x){
    //if int is nagitive number or end with 0 return false
    if (x < 0 || (x != 0 && x % 10 == 0)) {
      return false;
    }

    //split whole number into two separate half number, reverse second half number
    reversedNumber = 0;
    while (x > reversedNumber) {
      reversedNumber = (reversedNumber * 10) + (x % 10);
      x = x / 10;
    }

    //if first half equals second half return true, else false must consider odd number
    return x == reversedNumber || x == reversedNumber / 10;
  }


  //method to check how many int is Palindrome in certain range of number
  public static int howManyIntIsPalindrome (int startNumber, int endNumber){

    thisManyIntIsPalindrome = 0;

    for (int x = startNumber; x <= endNumber; x++){
      //System.out.println("x = " + x);

      if (isPalindrome (x)){
        thisManyIntIsPalindrome++;
      }
    }

    return thisManyIntIsPalindrome;
  }
}