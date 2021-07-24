package array;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        //  Example 1:
        //
        //  Input: [1,0,2,3,0,4,5,0]
        //  Output: null
        //  Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

        int[] nums = {1, 0, 2, 3, 0, 0, 5, 0};
        duplicateZeros(nums);


        //  Example 2:
        //
        //  Input: [1,2,3]
        //  Output: null
        //  Explanation: After calling your function, the input array is modified to: [1,2,3]

        int[] numsTwo = {1, 2, 3};
        duplicateZeros(numsTwo);

        //  Note:
        //
        //          1 <= arr.length <= 10000
        //          0 <= arr[i] <= 9


    }


    public static void duplicateZeros(int[] arr) {
        int count = 0;
        int length = arr.length - 1;

        for (int i = 0; i <= length - count; i++) {
            if (arr[i] == 0) {
                if (i == length - count) {
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                count++;
            }
        }

        for (int i = length - count; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[i + count] = arr[i];
            } else {
                arr[i + count] = arr[i];
                count--;
                arr[i + count] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
