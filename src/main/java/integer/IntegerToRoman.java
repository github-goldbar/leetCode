package integer;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
//  I             1
//  V             5
//  X             10
//  L             50
//  C             100
//  D             500
//  M             1000

//  I can be placed before V (5) and X (10) to make 4 and 9.
//  X can be placed before L (50) and C (100) to make 40 and 90.
//  C can be placed before D (500) and M (1000) to make 400 and 900.


//  1 <= num <= 3999

  public static void main(String[] args) {
    System.out.println(intToRoman(1994));
  }

  final static int[]    values = new int[] {1000,  900, 500,  400, 100,   90,  50,   40,  10,    9,   5,    4,   1};
  final static String[] romans = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

  public static String intToRoman(int num) {
    if(num < 0 || 3999 < num) {throw new IllegalArgumentException();}

    int i = 0;

    StringBuilder stringBuilder = new StringBuilder();

    while (num > 0) {
      if (num - values[i] >= 0) {
        stringBuilder.append(romans[i]);
        num -= values[i];
      } else {
        i++;
      }
    }

    return stringBuilder.toString();
  }

}
