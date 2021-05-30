package array;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
  public static void main(String[] args) {
//    Example 1:
//
//    Input: nums = [1,1,2]
//    Output: 2, nums = [1,2]
//    Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.

    int[] nums = {1, 1, 2};

    System.out.println("Example 1: " + removeDuplicates(nums));
    System.out.println("should be 2");
    System.out.println("nums = " + Arrays.toString(nums));


//    Example 2:
//
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4]
//    Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.

    int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    System.out.println("Example 2: " + removeDuplicates(nums1));
    System.out.println("should be 5");
    System.out.println("nums1 = " + Arrays.toString(nums1));


//    [1]

    int[] nums2 = {1};

    System.out.println("Example 3: " + removeDuplicates(nums2));
    System.out.println("should be 1");
    System.out.println("nums2 = " + Arrays.toString(nums2));

//    Constraints:
//
//    0 <= nums.length <= 3 * 104
//            -104 <= nums[i] <= 104
//    nums is sorted in ascending order.
  }

  public static int removeDuplicates(int[] nums) {
    int i = 0, j = 0, length = nums.length;

    while (i < length) {
      if (nums[i] != nums[j]){
        j++;
        nums[j] = nums[i];
      }
      i++;
    }

    return (i != 0) ? j + 1 : j;


//    int count=0;
//    for(int num:nums){
//      if(num>nums[count]){
//        // count++;
//        nums[++count]= num  ;
//      }
//    }
//    return ++count;
  }
}
