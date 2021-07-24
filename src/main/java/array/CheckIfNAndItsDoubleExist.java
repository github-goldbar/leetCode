package array;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        //    i != j
        //    0 <= i, j < arr.length
        //    arr[i] == 2 * arr[j]

        //    Example 1:
        //
        //    Input: arr = [10,2,5,3]
        //    Output: true
        //    Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
        int[] nums = {10, 2, 5, 3};

        System.out.println("Example 1: " + checkIfExist(nums));
        System.out.println("should be true");
        System.out.println();

        //    Example 2:
        //
        //    Input: arr = [7,1,14,11]
        //    Output: true
        //    Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.

        int[] nums2 = {7, 1, 14, 11};
        System.out.println("Example 2: " + checkIfExist(nums2));
        System.out.println("should be true");
        System.out.println();

        //    Example 3:
        //
        //    Input: arr = [3,1,7,11]
        //    Output: false
        //    Explanation: In this case does not exist N and M, such that N = 2 * M.

        int[] nums3 = {3, 1, 7, 11};
        System.out.println("Example 3: " + checkIfExist(nums3));
        System.out.println("should be false");
        System.out.println();

        //    Example 4:
        //
        //    Input: arr = [0,0]
        //    Output: false
        //    Explanation: In this case does not exist N and M, such that N = 2 * M.

        int[] nums4 = {0, 0};
        System.out.println("Example 4: " + checkIfExist(nums4));
        System.out.println("should be true");
        System.out.println();

        //    Constraints:
        //
        //    2 <= arr.length <= 500
        //            -10^3 <= arr[i] <= 10^3
    }


    public static boolean checkIfExist(int[] arr) {
        //    for (int i = 0; i < arr.length; i++) {
        //      for (int j = i + 1; j < arr.length; j++) {
        //        if (i != j && (arr[i] == 2 * arr[j] || 2 * arr[i] == arr[j])) {
        //          return true;
        //        }
        //      }
        //    }
        //    return false;

        int[] seen = new int[2001];
        for (int n : arr) {
            if (n % 2 == 0 && seen[n / 2 + 1000] == 1) return true;
            int n2 = n * 2;
            if (n2 <= 1000 && n2 >= -1000) {
                if (seen[n2 + 1000] == 1) return true;
            }
            seen[n + 1000] = 1;
        }

        return false;

        //    solution: 1

        //    Arrays.sort(arr);
        //
        //    for (int i = 0; i < arr.length; i++) {
        //      if (binarySearch(arr, i, arr[i] * 2, 0, arr.length - 1)) {
        //        return true;
        //      }
        //    }
        //
        //    return false;
    }

    static int middle = 0;

    public static boolean binarySearch(int[] nums, int index, int target, int left, int right) {
        if (left > right) {
            return false;
        }

        middle = left + (right - left) / 2;

        if (nums[middle] == target && middle != index) {
            return true;
        }

        if (nums[middle] > target) {
            return binarySearch(nums, index, target, left, middle - 1);
        } else {
            return binarySearch(nums, index, target, middle + 1, right);
        }
    }
}
