package Lesson_21;
import java.util.Scanner;
public class spiderarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int n = scn.nextInt();
        System.out.print("enter the nubmber of columns: ");
        int m = scn.nextInt();
        if (n == 0 || m == 0){
            System.out.println("Array dismensions cannot be zero ");
            return;
        }
        int[][] arr = new int[n][m];
        System.out.println("enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }
}
