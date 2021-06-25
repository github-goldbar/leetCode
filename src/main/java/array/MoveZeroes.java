package array;

import java.util.Arrays;

public class MoveZeroes {
  public static void main(String[] args) {
//    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//    Note that you must do this in-place without making a copy of the array.
//
//
//
//    Example 1:
//
//    Input: nums = [0,1,0,3,12]
//    Output: [1,3,12,0,0]

    int[] nums = {0, 1, 0, 3, 12};
    moveZeroes(nums);
    System.out.println("Example 1: " + Arrays.toString(nums));


//    Example 2:
//
//    Input: nums = [1,0]
//    Output: [1,0]
//
    int[] nums2 = {1, 0};
    moveZeroes(nums2);
    System.out.println("Example 2: " + Arrays.toString(nums2));

//    Example 3:
//
//    Input: nums = [0]
//    Output: [0]
//
    int[] nums3 = {0};
    moveZeroes(nums3);
    System.out.println("Example 3: " + Arrays.toString(nums3));

//    Example 4:
//
//    Input: nums = [0,1]
//    Output: [0,1]
//
    int[] nums4 = {0, 1};
    moveZeroes(nums4);
    System.out.println("Example 4: " + Arrays.toString(nums4));
//
//    Constraints:
//
//       1 <= nums.length <= 104
//    -231 <= nums[i]     <= 231 - 1
  }

  static int writePointer, readPointer, length;

  public static void moveZeroes(int[] nums) {

    writePointer = 0;
    readPointer = 1;
    length = nums.length;

    while (readPointer <= length - 1) {
      while (nums[writePointer] != 0 && writePointer < length - 1) {
        writePointer++;
      }

      while (nums[readPointer] == 0 && readPointer < length - 1) {
        readPointer++;
      }

      if (writePointer < readPointer) {
        nums[writePointer] = nums[readPointer];
        nums[readPointer] = 0;
      }

      if (readPointer <= length - 1) {
        readPointer++;
      }
    }
  }
}
