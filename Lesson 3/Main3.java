import java.util.Scanner;

public class Main3 {
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    System.out.println("enter a word: ");

    String str = scn.nextLine();

    System.out.println("The word is " + str);

    System.out.println("enter a number: ");

    int num = scn.nextInt();

    System.out.println("number is :" + num);

    System.out.println("enter a float: ");

    float fnum = scn.nextFloat();

    System.out.println("floating Number is : " + fnum);

    System.out.println("second activity");

    System.out.println("enter a number: ");

    int num1 = scn.nextInt();

    if (num1>10){
      System.out.println("Greater");
    } else{
      System.out.println("lesser");
    }
    System.out.println("third activity");
    System.out.println("enter marks: ");
    int marks= scn.nextInt();
    if (marks>90){
        System.out.println("o");
    } else if (marks >80 && marks <=90){
        System.out.println("a+");
    } else if (marks >70 && marks <=80){
        System.out.println("a");
     } else if (marks >60 && marks <=70){
        System.out.println("b");
     } else {
      System.out.println("c");
     }

    scn.close();




   }


}
