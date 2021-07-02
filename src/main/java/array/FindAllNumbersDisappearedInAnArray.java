package array;

import javax.swing.event.ListDataEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
  public static void main(String[] args) {
//    Given an array nums of n integers where nums[i] is in the range [1, n],
//    return an array of all the integers in the range [1, n] that do not appear in nums.

//    Example 1:
//
//    Input: nums = [4,3,2,7,8,2,3,1]
//    Output: [5,6]

    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> list = findDisappearedNumbers(nums);
    System.out.println("list = " + list);
    System.out.println();


//    Example 2:
//
//    Input: nums = [1,1]
//    Output: [2]

//    Constraints:
//
//    n == nums.length
//    1 <= n <= 105
//    1 <= nums[i] <= n
//
//
//    Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
  }

  static List<Integer> list;
  public static List<Integer> findDisappearedNumbers(int[] nums) {
    list = new ArrayList<>();
    Arrays.sort(nums);
    System.out.println("nums = " + Arrays.toString(nums));

    for (int i = 1; i <= nums.length; i++) {
      if (i != nums[i - 1]) {
        list.add(i);
      }
    }

    return list;
  }
}
