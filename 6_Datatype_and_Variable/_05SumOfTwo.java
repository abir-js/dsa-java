import java.util.Scanner;

public class _05SumOfTwo {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number: ");
        a = sc.nextInt();
        System.out.println("Enter value of second number: ");
        b = sc.nextInt();

        System.out.println(a+b);
        sc.close();
    }
}
