package Lesson_6;
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args){
        // Scanner s = new Scanner(System.in);
        // System.out.println("enter number of test cases");
        // int t = s.nextInt();
        // for(int i=1;i<=t;i++){
        //     System.out.println("enter number of test cases");
        //     int n = s.nextInt();
        //     int count=0;
        //     for(int div=2; div * div <=n;div++){
        //         if(n%div == 0){
        //             count++;
        //             break;

        //         }
        //     }
        //     if(n<=1){
        //         System.out.println("not prime");
        //     }else if(count==0){
        //         System.out.println("prime");
        //     }else{
        //         System.out.println("not prime");
        //     }
        // }
       
    //     Scanner s = new Scanner(System.in);

    //     System.out.println("enter a number (n) : ");
    //     int n = s.nextInt();


    // for(int div = 2; div * div <= n; div++){
    //     while(n % div == 0){
    //         n = n / div;
    //         System.out.print(div + " ");

    //     }
    // }
    //  if(n != 1){
    //     System.out.print(n);
    //  }
    

    Scanner s = new Scanner(System.in);
    System.out.println("enter low: ");
    int low = s.nextInt();

    System.out.print("enter high: ");
    int high = s.nextInt();

    for(int n = low; n <= high; n++){
        if (n <= 1) continue;
        int count = 0;
        for(int div=2; div * div <= n; div++){
            if(n % div == 0){
                count++;
                break;
            }
        }
         if(count == 0){
            System.out.println(n);
         }



    }   
    }
    
}
