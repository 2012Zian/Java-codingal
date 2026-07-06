package Lesson_19;
import java.util.Scanner;
public class M {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of elements in th array");
        int n = s.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the " + n + "elements of the array:");
        
        for (int i = 0; i < n; i++) {
            int val = s.nextInt();
            if (val > max) max = val;
            if (val < min) min = val;
        }

        int span = max - min;
        System.out.println("The span of the atrray is: " + span);
    }
    
}
