package Patterns;
import java.util.Scanner;
public class Pattern04 {
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
    }
}
