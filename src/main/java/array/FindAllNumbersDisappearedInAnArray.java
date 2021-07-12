package array;

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

    int[] nums2 = {1, 1};
    List<Integer> list2 = findDisappearedNumbers(nums2);
    System.out.println("list = " + list2);
    System.out.println();

//    Constraints:
//
//    n == nums.length
//    1 <= n <= 10^5
//    1 <= nums[i] <= n
//
//
//    Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
  }

  static List<Integer> list;
  public static List<Integer> findDisappearedNumbers(int[] nums) {

    list = new ArrayList<>();

//    int[] count = new int[100001];
    int[] count = new int[nums.length + 1];

    for (int num : nums) {
      count[num]++;
    }

    for (int i = 0; i < nums.length; i++) {
      if (count[i + 1] == 0) {
        list.add(i + 1);
      }
    }


    return list;
  }
}
