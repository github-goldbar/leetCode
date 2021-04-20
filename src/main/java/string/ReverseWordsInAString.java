package string;

//problem 151
public class ReverseWordsInAString {
  public static void main(String[] args) {
    String str;

//    Example 1:
//
//    Input: s = "the sky is blue"
//    Output: "blue is sky the"

    str = "the sky is blue";
    System.out.println(str);
    System.out.println("Example 1 is " + reverseWords(str).equals("blue is sky the"));
    System.out.println();

//    Example 2:
//
//    Input: s = "  hello world  "
//    Output: "world hello"
//    Explanation: Your reversed string should not contain leading or trailing spaces.

    str = "  hello world  ";
    System.out.println(str);
    System.out.println("Example 2 is " + reverseWords(str).equals("world hello"));
    System.out.println();

//    Example 3:
//
//    Input: s = "a good   example"
//    Output: "example good a"
//    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

    str = "a good   example";
    System.out.println(str);
    System.out.println("Example 3 is " + reverseWords(str).equals("example good a"));
    System.out.println();

//    Example 4:
//
//    Input: s = "  Bob    Loves  Alice   "
//    Output: "Alice Loves Bob"

    str = "  Bob    Loves  Alice   ";
    System.out.println(str);
    System.out.println("Example 4 is " + reverseWords(str).equals("Alice Loves Bob"));
    System.out.println();

//    Example 5:
//
//    Input: s = "Alice does not even like bob"
//    Output: "bob like even not does Alice"

    str = "Alice does not even like bob";
    System.out.println(str);
    System.out.println("Example 5 is " + reverseWords(str).equals("bob like even not does Alice"));

  }

  public static String reverseWords(String s) {
    StringBuilder stringBuilder = new StringBuilder();
    String[] strings = s.trim().split(" ");
    int stringsLength = strings.length;


    for (int i = stringsLength - 1; i >= 0 ; i--){
//      System.out.println("strings[i] = " + strings[i]);
      if (!strings[i].equals("")) {
        stringBuilder.append(strings[i]);
        stringBuilder.append(" ");
      }
    }

//    System.out.println(stringBuilder);

    stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());

//    System.out.println(stringBuilder);
    return stringBuilder.toString();
  }
}
