package integer;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {

    int[] nums;
    int target;
    int[] returnNums;


//    Example 1:
//
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Output: Because nums[0] + nums[1] == 9, we return [0, 1].

    nums = new int[]{2, 7, 11, 15};
    target = 9;
    returnNums = new int[]{0, 1};

    System.out.println("Example 1: is " + (Arrays.equals(twoSum(nums, target), returnNums)));
    System.out.println();

//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]

    nums = new int[]{3,2,4};
    target = 6;
    returnNums = new int[]{1, 2};

    System.out.println("Example 2: is " + (Arrays.equals(twoSum(nums, target), returnNums)));
    System.out.println();


//    Example 3:
//
//    Input: nums = [3,3], target = 6
//    Output: [0,1]
//[-3,4,3,90]
//    0


    nums = new int[]{-3, 4, 3, 90};
    target = 6;
    returnNums = new int[]{0, 2};

    System.out.println("Example 3: is " + (Arrays.equals(twoSum(nums, target), returnNums)));
    System.out.println();

  }

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> intMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums[" + i + "] = " + nums[i]);
      System.out.println(Math.abs(target - nums[i]));

      int temp = target - nums[i];

      if (intMap.containsKey(temp)) {
        return new int[] { intMap.get(temp), i };
      }
      intMap.put(nums[i], i);
      System.out.println(intMap);
    }
    throw new IllegalArgumentException("No two sum solution");
  }

}
