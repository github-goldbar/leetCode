package list;

import java.util.Arrays;

public class PlusOne {
  public static void main(String[] args) {

    //        Example 1:
    //
    //        Input: digits = [1,2,3]
    //        Output: [1,2,4]
    //        Explanation: The array represents the integer 123.

    int[] digits = new int[]{1,2,3};
    System.out.println("Example 1 = " + Arrays.toString(plusOne(digits)));
    System.out.println("Output: [1,2,4]");

    //        Example 2:
    //
    //        Input: digits = [4,3,2,1]
    //        Output: [4,3,2,2]
    //        Explanation: The array represents the integer 4321.

    digits = new int[]{4,3,2,1};
    System.out.println("Example 2 = " + Arrays.toString(plusOne(digits)));
    System.out.println("Output: [4,3,2,2]");

    //        Example 3:
    //
    //        Input: digits = [0]
    //        Output: [1]

    digits = new int[]{0};
    System.out.println("Example 3 = " + Arrays.toString(plusOne(digits)));
    System.out.println("Output: [1]");

    digits = new int[]{1, 4, 9, 9, 9};
    System.out.println("Example 4 = " + Arrays.toString(plusOne(digits)));
    System.out.println("Output: [1, 5, 0, 0, 0]");

    digits = new int[]{9, 9, 9, 9, 9};
    System.out.println("Example 5 = " + Arrays.toString(plusOne(digits)));
    System.out.println("Output: [1, 0, 0, 0, 0, 0]");

    int[] array1 = new int[]{9, 9, 9, 9, 9};
    int[] array2 = new int[]{2, 2, 2, 2, 2};

//    int[] array1and2 = new int[array1.length + array2.length];
//    System.out.println("array1and2 = " + Arrays.toString(array1and2));
//    System.arraycopy(array1, 0, array1and2, 0, array1.length);
//    System.out.println("array1and2 = " + Arrays.toString(array1and2));
//    System.arraycopy(array2, 0, array1and2, array1.length, array2.length);
//    System.out.println("array1and2 = " + Arrays.toString(array1and2));

  }

  public static int[] plusOne(int[] digits) {
    digits[digits.length - 1] += 1;
    int carry = 0;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] > 9) {
        digits[i] = 0;
        carry = 1;
        if (i > 0) {
          digits[i - 1]++;
        }
      }else{
        return digits;
      }
    }
//    int[] array1and2 = new int[array1.length + array2.length];
//    System.arraycopy(array1, 0, array1and2, 0, array1.length);
//    System.arraycopy(array2, 0, array1and2, array1.length, array2.length);


    if (carry > 0) {
      int[] ints = new int[1 + digits.length];
      System.arraycopy(new int[]{1}, 0, ints, 0, 1);
      System.arraycopy(digits, 0, ints, 1, digits.length);
      return ints;
    }



    return digits;


// best practice

//    for (int i = digits.length - 1; i >= 0; i--) {
//      if (digits[i] < 9) {
//        digits[i]++;
//        return digits;
//      }
//      digits[i] = 0;
//    }
//
//    int[] intsIfAllIntIsNine = new int[digits.length];
//    intsIfAllIntIsNine[0] = 1;
//    return intsIfAllIntIsNine;
  }
}
