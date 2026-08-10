package Lesson_28;
import java.util.Scanner;
public class IndicesArray {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the " + n + "elements of the array");
        for (int i = 0; i < n; i++) {
        arr[i] = scn.nextInt();

        }
        System.out.print("enter the number to find indices: ");
        int x = scn.nextInt();
        AllIndexes(arr , n , x);
    }
    public static int AllIndexesRecursive(int[] input, int size, int x, int[] outputs) {
    if (size == 0)
        return 0;
    int smallAns = AllIndexesRecursive(input, size - 1, x, output);

    if (input[size - 1] == x) {
    output
    }
    }
}
