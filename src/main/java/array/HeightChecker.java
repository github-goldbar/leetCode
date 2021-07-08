package array;

public class HeightChecker {
  public static void main(String[] args) {
    // A school is trying to take an annual photo of all the students.
    // The students are asked to stand in a single file line in non-decreasing order by height.
    // Let this ordering be represented by the integer array expected where expected[i]
    // is the expected height of the ith student in line.
    //
    // You are given an integer array heights representing the current order that the students are standing in.
    // Each heights[i] is the height of the ith student in line (0-indexed).
    //
    // Return the number of indices where heights[i] != expected[i].

    // Example 1:
    //
    // Input: heights = [1,1,4,2,1,3]
    // Output: 3
    // Explanation:
    // heights:  [1,1,4,2,1,3]
    // expected: [1,1,1,2,3,4]
    // Indices 2, 4, and 5 do not match.

    int[] nums = {1, 1, 4, 2, 1, 3};
    System.out.println("Example 1: " + heightChecker(nums));
    System.out.println();

    // Example 2:
    //
    // Input: heights = [5,1,2,3,4]
    // Output: 5
    // Explanation:
    // heights:  [5,1,2,3,4]
    // expected: [1,2,3,4,5]
    // All indices do not match.

    int[] nums2 = {5, 1, 2, 3, 4};
    System.out.println("Example 2: " + heightChecker(nums2));
    System.out.println();

    // Example 3:
    //
    // Input: heights = [1,2,3,4,5]
    // Output: 0
    // Explanation:
    // heights:  [1,2,3,4,5]
    // expected: [1,2,3,4,5]
    // All indices match.

    int[] nums3 = {1, 2, 3, 4, 5};
    System.out.println("Example 3: " + heightChecker(nums3));
    System.out.println();

    int[] nums4 = {2, 1, 2, 1, 1, 2, 2, 1};
    System.out.println("Example 4: " + heightChecker(nums4));
    System.out.println();

    // Constraints:
    //
    // 1 <= heights.length <= 100
    // 1 <= heights[i] <= 100
  }

  static int answer, index;
  public static int heightChecker(int[] heights) {
    answer = 0; index = 0;
    int[] count = new int[101];

    for (int height : heights) {
      count[height]++;
    }

    for (int i = 0; i < count.length; i++) {
      while (count[i] != 0 && index < heights.length) {
        if (i != heights[index]) {
          answer++;
        }
        count[i]--;
        index++;
      }
    }

    return answer;
  }
}
