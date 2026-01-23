package functions;
import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        evenOrOdd(n);
    }

    static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is Even Number");
        } else {
            System.out.println(n + " is Odd Number");
        }
    }
}
