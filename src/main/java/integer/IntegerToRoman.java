package integer;

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

  public static String intToRoman(int num) {
    Map<Integer, String> romanHashMap = new TreeMap<>();
    romanHashMap.put(1,    "I");
    romanHashMap.put(5,    "V");
    romanHashMap.put(10,   "X");
    romanHashMap.put(50,   "L");
    romanHashMap.put(100,  "C");
    romanHashMap.put(500,  "D");
    romanHashMap.put(1000, "M");


    System.out.println("num init = " + num);
    System.out.println(romanHashMap);

    int divideNum = 1;
    int currentNum = 1;

    while (num >= divideNum) {
      divideNum *= 10;
    }
    System.out.println("before divideNum = " + divideNum);

    divideNum /= 10;

    System.out.println("after divideNum = " + divideNum);

    StringBuilder stringBuilder = new StringBuilder();

    char[] chars = {};

    while (num > 0){
      currentNum = num / divideNum;
      System.out.println("currentNum = " + currentNum);

      //    1 to 3
      if (1 <= currentNum && currentNum <= 3) {

        for (int i = 0; i < currentNum; i++) {
          stringBuilder.append(romanHashMap.get(divideNum));
        }
      }
      //    4
      else if (currentNum == 4) {
        stringBuilder.append(romanHashMap.get(divideNum));
        stringBuilder.append(romanHashMap.get(divideNum * 5));
      }
      //    5
      else if (currentNum == 5) {
        stringBuilder.append(romanHashMap.get(divideNum * 5));
      }
      //    6 to 8
      if (6 <= currentNum && currentNum <= 8) {
        stringBuilder.append(romanHashMap.get(divideNum * 5));
        for (int i = 0; i < currentNum - 5; i++) {
          stringBuilder.append(romanHashMap.get(divideNum));
        }
      }
      //    9
      else if (currentNum == 9) {
        stringBuilder.append(romanHashMap.get(divideNum));
        stringBuilder.append(romanHashMap.get(divideNum * 10));
      }

      System.out.println("stringBuilder = " + stringBuilder);
      System.out.println();

      num %= divideNum;
      System.out.println("num after = " + num);
      divideNum /= 10;
    }




    return stringBuilder.toString();
  }

}
