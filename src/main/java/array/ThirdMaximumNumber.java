package array;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        //    Given integer array nums, return the third maximum number in this array.
        //    If the third maximum does not exist, return the maximum number.

        //    Example 1:
        //
        //    Input: nums = [3,2,1]
        //    Output: 1
        //    Explanation: The third maximum is 1.

        int[] nums = {3, 2, 1};
        System.out.println("Example 1: " + thirdMax(nums));
        System.out.println("1");
        System.out.println();

        //    Example 2:
        //
        //    Input: nums = [1,2]
        //    Output: 2
        //    Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

        int[] nums2 = {1, 2};
        System.out.println("Example 2: " + thirdMax(nums2));
        System.out.println("2");
        System.out.println();

        //    Example 3:
        //
        //    Input: nums = [2,2,3,1]
        //    Output: 1
        //    Explanation: Note that the third maximum here means the third maximum distinct number.
        //    Both numbers with value 2 are both considered as second maximum.

        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Example 3: " + thirdMax(nums3));
        System.out.println("1");
        System.out.println();


        int[] nums4 = {1, 2, -2147483648};
        System.out.println("Example 4: " + thirdMax(nums4));
        System.out.println("-2147483648");
        System.out.println();

        //    Constraints:
        //
        //    1 <= nums.length <= 104
        // -2＾31 <=     num <= 2＾31 - 1
        //
        //
        //    Follow up: Can you find an O(n) solution?
    }

    public static int thirdMax(int[] nums) {

        if (nums.length < 2) {
            return nums[0];
        }

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

        int counter = 0;
        int a = nums[0];
        int b = nums[1];
        if (a != b) {
            counter = 1;
        }

        for (int num : nums) {
            if (num != a && num != b && counter < 3) {
                counter++;
                if (counter == 1) {
                    b = num;
                }
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != first && num != second) {
                third = num;
            }
        }

        if (counter < 2) return first;

        return third;
    }


    //  public int thirdMax(int[] nums) {
    //    Integer first = null, second = null, third = null;
    //    for (int n: nums) {
    //      if (first == null || n > first) {
    //        third = second;
    //        second = first;
    //        first = n;
    //      } else if (first > n && (second == null || n > second)) {
    //        third = second;
    //        second = n;
    //      } else if ((second != null && second > n) && (third == null || n > third)) {
    //        third = n;
    //      }
    //    }
    //    return third == null? first: third;
    //  }


    //  public static int thirdMax(int[] nums) {
    //    Integer first = null, second = null, third = null;
    //
    //
    //    for (Integer num: nums) {
    //
    //      if (num.equals(first) || num.equals(second) || num.equals(third)) {
    //        continue;
    //      }
    //
    //      if (first == null || num > first) {
    //
    //        third = second;
    //        second = first;
    //        first = num;
    //
    //      } else if (second == null || num > second) {
    //
    //        third = second;
    //        second = num;
    //
    //      } else if (third == null || num > third) {
    //
    //        third = num;
    //
    //      }
    //    }
    //
    //    return third == null ? first : third;
    //  }
}
