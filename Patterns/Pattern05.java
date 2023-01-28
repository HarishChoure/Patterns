package Patterns;
import java.util.Scanner;
public class Pattern05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            int space = 1;

            while(space<= n-i){
                System.out.print(" ");
                space = space+1;
            }
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j = j+1;
            }
            int k = 1;
            while(k<i){
                System.out.print("*");
                k = k+1;
            }
            System.out.println();
            i = i +1;
        }
        int c =1;
        while(c<n){
            int spa = 1;
            while(spa<=c){
                System.out.print(" ");
                spa=spa+1;
            }
            int a = 1;
            while(a<=n-c){
                System.out.print("*");
                a=a+1;
            }
            int b=1;
            while(b<n-c){
                System.out.print("*");
                b = b+1;
            }
            System.out.println();
            c = c+1;
        }
    }
}
