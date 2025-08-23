// package 9Loops;

import java.util.Scanner;

public class _02break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=1; i>1; i++){
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if(n%10 == 0) break;
        }

        sc.close();
    }
}
