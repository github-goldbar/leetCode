package array;

public class MergeSortedArraySolution {

  public static void main(String[] args) {
//    Example 1:
//
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]


    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] nums2 = {2, 5, 6};
    int n = 3;

    merge(nums1, m, nums2, n);


//    Example 2:
//
//    Input: nums1 = [1], m = 1, nums2 = [], n = 0
//    Output: [1]

    int[] numsTwo1 = {1};
    int m1 = 1;
    int[] numsTwo2 = {};
    int n1 = 0;

    merge(numsTwo1, m1, numsTwo2, n1);

//    Constraints:
//
//    nums1.length == m + n
//    nums2.length == n
//    0 <= m, n <= 200
//    1 <= m + n <= 200
//            -10 pow 9 <= nums1[i], nums2[i] <= 10 pow 9


  }


  public static void merge(int[] nums1, int m, int[] nums2, int n) {

    while (0 < m && 0 < n) {
      if (nums1[m - 1] > nums2[n - 1]) {
        nums1[m + n - 1] = nums1[m - 1];
        m--;
      } else {
        nums1[m + n - 1] = nums2[n - 1];
        n--;
      }
    }

    while (0 < n) {
      nums1[m + n - 1] = nums2[n - 1];
      n--;
    }

//    int tmp = 0;
//    int forChangePosition = 0;
//
//    int i = 0, j = 0;
//
//
//
//
//    while (i < m && j < n) {
//      if (tmp != 0) {
//        if (nums1[i] < nums2[j]) {
//          i++;
//        } else {
//          tmp = nums1[i + 1];
//          nums1[i + 1] = nums2[j];
//          j++;
//        }
//      } else {
//        if (tmp < nums2[j]) {
//          forChangePosition = tmp;
//
//        } else {
//
//        }
//      }
//
//    }
//
//    while (i < m) {
//      mergedNums[k] = nums1[i];
//      i++;
//    }
//    while (j < n) {
//      mergedNums[k] = nums2[j];
//      j++;
//    }
  }

}
