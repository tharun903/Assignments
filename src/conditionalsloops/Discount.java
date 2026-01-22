package conditionalsloops;
import java.util.*;

public class Discount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();

        double discount = 0;

        if (bill < 1000) {
            discount = bill * 0.05;
        } 
        else if (bill < 5000) {
            discount = bill * 0.10;
        } 
        else if (bill < 10000) {
            discount = bill * 0.20;
        } 
        else if (bill < 50000) {
            discount = bill * 0.30;
        } 
        else {
            discount = bill * 0.50;
        }

        discount = Math.round(discount * 100.0) / 100.0;
        double finalPrice = bill - discount;

        System.out.println("Discount Amount: ₹" + discount);
        System.out.println("Final Price: ₹" + finalPrice);
    }
}
