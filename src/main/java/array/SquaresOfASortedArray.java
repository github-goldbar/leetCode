package array;

import java.util.Arrays;

public class SquaresOfASortedArray {
  public static void main(String[] args) {
//    Example 1:
//
//    Input: nums = [-4,-1,0,3,10]
//    Output: [0,1,9,16,100]
//    Explanation: After squaring, the array becomes [16,1,0,9,100].
//    After sorting, it becomes [0,1,9,16,100].

    int[] numsOne = {-4, -1, 0, 3, 10};
    System.out.println("Example 1: " + Arrays.toString(sortedSquares(numsOne)));
    System.out.println(" should be [0, 1, 9, 16, 100]");
    System.out.println();

//    Example 2:
//
//    Input: nums = [555,901,482,1771]
//    Output: 1
//    Explanation:
//    Only 1771 contains an even number of digits.

    int[] numsTwo = {-7, -3, 2, 3, 11};
    System.out.println("Example 2: " + Arrays.toString(sortedSquares(numsTwo)));
    System.out.println( " should be [4, 9, 9, 49, 121]");
    System.out.println();

//    Constraints:

//    1 <= nums.length <= 104
//            -104 <= nums[i] <= 104
//    nums is sorted in non-decreasing order.
  }


  public static int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    selectionSort(nums);
//    nums = Arrays.stream(nums).sorted().toArray();
    System.out.println(Arrays.toString(nums));
    return nums;

//    int length = nums.length - 1;
//    int start = 0;
//    int end = length;
//    int[] ans =new int[length + 1];
//
//    for (int i = length; i >= 0; i--) {
//      if (Math.abs(nums[start]) > Math.abs(nums[end])) {
//        ans[i] = nums[start] * nums[start];
//        start++;
//      } else {
//        ans[i] = nums[end] * nums[end];
//        end--;
//      }
//    }
//    return ans;
  }

  static int smallest;
  public static void selectionSort(int[] nums) {
    smallest = nums[0];

    for (int i = 0; i < nums.length; i++) {
      if (smallest > nums[i]) {
        smallest = nums[i];
      }
    }
    System.out.println("smallest = " + smallest);
//    Arrays.sort(nums);
  }
}
