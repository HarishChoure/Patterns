package Patterns;
import java.util.Scanner;
public class Pattern06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i= 1;
        while(1<=n){
            int j = 1;
            while(j<=n){
                System.out.print(i);
                j = j+1;
            }
            System.out.println();
            n = n-1;
            i=i+1;

        }
    }
}
