package string;

//problem 58

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s;

        //    Example 1:
        //
        //    Input: s = "Hello World"
        //    Output: 5
        s = "Hello World";
        System.out.println("Example 1 is " + (lengthOfLastWord(s) == 5));

        //    Example 2:
        //
        //    Input: s = " "
        //    Output: 0

        //    s = " ";
        //    System.out.println("Example 2 is " + (lengthOfLastWord(s) == 0));

        s = "a";
        System.out.println("Example 3 is " + (lengthOfLastWord(s) == 1));

        s = "a ";
        System.out.println("Example 4 is " + (lengthOfLastWord(s) == 1));
    }

    public static int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        int lengthOfFullWord = s.length();

        for (int i = lengthOfFullWord - 1; i >= 0; i--) {

            System.out.println(s.charAt(i));

            if (s.charAt(i) == ' ' && lengthOfLastWord > 0) {
                break;
            } else if (s.charAt(i) != ' ') {
                lengthOfLastWord++;
            }

        }

        System.out.println("lengthOfLastWord = " + lengthOfLastWord);

        return lengthOfLastWord;
    }
}
