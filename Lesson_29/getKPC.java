package Lesson_29;
import java.util.*;
class getKPC {
    private static List<String> printWords(int[] numbers ,int len, int numIndex, String s) {
    if (len == numIndex) {
    
        return new ArrayList(Collections.singleton(s));
    }

    List<String> stringList = new ArrayList<>();

    for (int i = 0; i < numberToCharMap[numbers[numIndex]].length, i++) {
    String scopy = String.copyValueOf(s.toCharArray());
    scopy = scopy.concat(numberToCharMap[numbers[numIndex]][i].toString());
    stringList.addAll(printWords(numbers, len, numIndex + 1, scopy));

    }

    return stringList;
    }
    private static void printWord(int[] numbers) {
    generateNumberToCharMap();
    List<String> stringList = printWords(numbers, numbers.length, 0 ,"");
    stringList.stream().forEach(System.out:: println);

    }

    private static void generateNumberToCharMap() {
    numberToCharMap = new Character[10][5];
    numberToCharMap[0] = new Character[]{'0'};
    numberToCharMap[1] = new Character[]{'1'};
    numberToCharMap[2] = new Character[]{'2'};
    numberToCharMap[3] = new Character[]{'3'};

    }
}
