package array;

public class RemoveElement {
    public static void main(String[] args) {
        //    Example 1:
        //
        //    Input: nums = [3,2,2,3], val = 3
        //    Output: 2, nums = [2,2]
        //    Explanation: Your function should return length = 2, with the first two elements of nums being 2.
        //    It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        System.out.println("Example 1: " + removeElement(nums, val));
        System.out.println("should be 2");

        //    Example 2:
        //
        //    Input: nums = [0,1,2,2,3,0,4,2], val = 2
        //    Output: 5, nums = [0,1,4,0,3]
        //    Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        System.out.println("Example 2: " + removeElement(nums2, val2));
        System.out.println("should be 5");

        //    Constraints:
        //
        //    0 <= nums.length <= 100
        //    0 <= nums[i] <= 50
        //    0 <= val <= 100

    }

    public static int removeElement(int[] nums, int val) {

        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] != val) {
                l++;
            } else {
                nums[l] = nums[r];
                r--;
            }
        }

        return l;

        //    solution 1
        //    int i = 0;
        //    for (int j = 0; j < nums.length; j++) {
        //      if (nums[j] != val) {
        //        nums[i] = nums[j];
        //        i++;
        //      }
        //    }
        //    return i;

        //    solution 2
        //    int i = 0;
        //    int n = nums.length;
        //    while (i < n) {
        //      if (nums[i] == val) {
        //        nums[i] = nums[n - 1];
        //        // reduce array size by one
        //        n--;
        //      } else {
        //        i++;
        //      }
        //    }
        //    return n;


    }
}
