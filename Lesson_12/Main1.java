package Lesson_12;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        try{
            System.out.println("enter two numbers: ");
            int x = s.nextInt();
            int y = s.nextInt();
            int z = x/y;
            System.out.println(x + " / " + y + " = " + z);

        }catch(ArithmeticException ex){
            System.out.println("-----catch block ------");
            System.out.println(ex.toString());

        }finally{
            System.out.println("-----finally block------");
            System.out.println("Application desighned and developed by");
            System.out.println("team @ Codingal");
            s.close();
        }
        System.out.println("----Done--------");
    }
    
}
