package array;

public class FindNumbersWithEvenNumberOfDigits {
  public static void main(String[] args) {
//    Example 1:
//
//    Input: nums = [12,345,2,6,7896]
//    Output: 2
//    Explanation:
//    12 contains 2 digits (even number of digits).
//    345 contains 3 digits (odd number of digits).
//    2 contains 1 digit (odd number of digits).
//    6 contains 1 digit (odd number of digits).
//    7896 contains 4 digits (even number of digits).
//            Therefore only 12 and 7896 contain an even number of digits.

    int[] numsOne = {12, 345, 2, 6, 7896};
    System.out.println("Example 1: " + findNumbers(numsOne) + " should be 2");

//    Example 2:
//
//    Input: nums = [555,901,482,1771]
//    Output: 1
//    Explanation:
//    Only 1771 contains an even number of digits.

    int[] numsTwo = {555,901,482,1771};
    System.out.println("Example 2: " + findNumbers(numsTwo) + " should be 1");

//    Constraints:
//
//    1 <= nums.length <= 500
//    1 <= nums[i] <= 10^5
  }

  static int count, digitLength;

  public static int findNumbers(int[] nums) {

    count = 0;

    for (int num : nums) {
      if (getDigitLength(num) % 2 == 0)
//      if ((Math.floor(Math.log10(num) + 1)) % 2 == 0)
        count++;
    }

    return count;
  }

  public static int getDigitLength(int num) {
    digitLength = 0;

    while ((num) != 0) {
      num /= 10;
      digitLength++;
    }

    return digitLength;
  }
}
