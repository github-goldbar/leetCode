package array;

public class ValidMountainArray {
    public static void main(String[] args) {
        //    arr.length >= 3
        //    There exists some i with 0 < i < arr.length - 1 such that:
        //        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        //        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]


        //    Example 1:
        //
        //    Input: arr = [2,1]
        //    Output: false

        int[] nums = {2, 1};

        System.out.println("Example 1: " + validMountainArray(nums));
        System.out.println("should be false");
        System.out.println();

        //    Example 2:
        //
        //    Input: arr = [3,5,5]
        //    Output: false

        int[] nums2 = {3, 5, 5};

        System.out.println("Example 2: " + validMountainArray(nums2));
        System.out.println("should be false");
        System.out.println();

        //    Example 3:
        //
        //    Input: arr = [0,3,2,1]
        //    Output: true

        int[] nums3 = {0, 3, 2, 1};

        System.out.println("Example 3: " + validMountainArray(nums3));
        System.out.println("should be true");
        System.out.println();

        //    Example 4:
        //
        //    Input: arr = [0,1,2,3,4,5,6,7,8,9]
        //    Output: false

        int[] nums4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Example 4: " + validMountainArray(nums4));
        System.out.println("should be false");
        System.out.println();

        //    Example 5:
        //
        //    Input: arr = [0,1,2,3,4,5,6,7,8,9].reverse
        //    Output: false

        int[] nums5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};


        System.out.println("Example 5: " + validMountainArray(nums5));
        System.out.println("should be false");
        System.out.println();

        //    Example 6:
        //
        //    Input: arr = [1,7,9,5,4,1,2]
        //    Output: false

        int[] nums6 = {1, 7, 9, 5, 4, 1, 2};


        System.out.println("Example 6: " + validMountainArray(nums6));
        System.out.println("should be false");
        System.out.println();

        //    Constraints:
        //
        //    1 <= arr.length <= 104
        //    0 <= arr[i] <= 104
    }

    public static boolean validMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1;

        //    From i to start, not include i.
        while (l < arr.length - 1 && arr[l] < arr[l + 1]) {
            l++;
        }

        //    From i to end, not include i.
        while (0 < r && arr[r - 1] > arr[r]) {
            r--;
        }

        return l == r && l != 0 && r != arr.length - 1;
    }
}
