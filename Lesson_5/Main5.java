package Lesson_5;
import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        // for (int i=10 ; i>=1 ; i--){
        //     System.out.println("the value is " + i);
        // }
    //  Scanner s = new Scanner(System.in);
    //  System.out.println("enter a number: ");
    //  int n = s.nextInt();
    //  int sum = 0;
    //  for(int i=1; i<=n ; i++){
    //     sum = sum+i;

    //  }
    //  System.out.println("The sun is :" +sum);
    Scanner s = new Scanner(System.in);
    int number;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    char choice;

    do{
        System.out.println("enter a number: ");
        number = s.nextInt();
        if (number>max){
            max = number;
        }
        if(number<min){
            min = number;
        }
        System.out.println("Do you want to continue y/ n");
        choice = s.next().charAt(0);

    }while(choice=='y' || choice=='y');
    System.out.println("largest number:" +max);
    System.out.println("smallest number:" + min);
     
    }
}
