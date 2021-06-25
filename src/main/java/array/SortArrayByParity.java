package array;

import java.util.Arrays;

public class SortArrayByParity {
  public static void main(String[] args) {
//    Given an array nums of non-negative integers, return an array consisting of all the even elements of nums,
//    followed by all the odd elements of nums.
//
//    You may return any answer array that satisfies this condition.
//
//
//
//    Example 1:
//
//    Input: nums = [3,1,2,4]
//    Output: [2,4,3,1]
//    The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//
    int[] nums = {3, 1, 2, 4};

//    System.out.println("Example 1: " + Arrays.toString(sortArrayByParity(nums)));

    //    Example 2:
    //
    //    Input: nums = [0,2,1,4]
    //    Output: [0,4,1,2]
    //
//    int[] nums2 = {0, 2, 1, 4};
//    System.out.println("Example 2: " + Arrays.toString(sortArrayByParity(nums2)));

    //    Example 3:
    //
    //    Input: nums = [3,1,2,4]
    //    Output: [2,4,3,1]
    //
    int[] nums3 = {3, 1, 2, 4};
    System.out.println("Example 3: " + Arrays.toString(sortArrayByParity(nums3)));
//    Note:
//
//    1 <= nums.length <= 5000
//    0 <= nums[i] <= 5000
  }

  public static int[] sortArrayByParity(int[] nums) {

    int length = nums.length;
    int l = 0;
    int r = length - 1;
    int tmp;

    while (l < r) {
      while (l < length && nums[l] % 2 == 0) {
        l++;
      }
      while (0 < r && nums[r] % 2 == 1) {
        r--;
      }

      if (l >= r) {
        continue;
      }

      tmp = nums[l];
      nums[l] = nums[r];
      nums[r] = tmp;

      l++;
      r--;
    }

    return nums;
  }
}
