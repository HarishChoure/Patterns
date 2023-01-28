package Patterns;
import java.util.Scanner;
public class Pattern02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 1;
        while(i<=n){
            int j = 0;
            while(j<i){
                System.out.print(count);
                count = count+1;
                j = j +1;
            }
            System.out.println();
            i = i+1;
        }
    }
}
