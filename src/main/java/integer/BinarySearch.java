package integer;

import javax.sound.midi.MidiDevice;
import java.lang.reflect.Method;
import java.util.Arrays;

public class BinarySearch {
  public static void main(String[] args) {

    int[] nums;
    int target;

//    Example 1:
//
//    Input: nums = [-1,0,3,5,9,12], target = 9
//    Output: 4
//    Explanation: 9 exists in nums and its index is 4

    nums = new int[]{-1, 0, 3, 5, 9, 12};
    target = 9;

    System.out.println("Example 1: is " + (search(nums, target) == 4));
    System.out.println();

//    Example 2:
//
//    Input: nums = [-1,0,3,5,9,12], target = 2
//    Output: -1
//    Explanation: 2 does not exist in nums so return -1

    nums = new int[]{-1, 0, 3, 5, 9, 12};
    target = 2;

    System.out.println("Example 2: is " + (search(nums, target) == -1));
    System.out.println();
  }

  public static int search(int[] nums, int target) {
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] == target)
//        return i;
//    }

    return binarySearch(nums, target, 0, nums.length - 1);
  }

 static int middle = 0;

  public static int binarySearch(int[] nums, int target, int left, int right) {
    if (left > right) {
      return -1;
    }

    System.out.println("left = " + left);
    System.out.println("right = " + right);

    middle = left + (right - left) / 2;
    System.out.println("middle = " + middle);

    if (nums[middle] == target) {
      return middle;
    }

    System.out.println("");
    if (nums[middle] > target) {
      return binarySearch(nums, target, left, middle - 1);
    } else {
      return binarySearch(nums, target, middle + 1, right);
    }
  }
}
