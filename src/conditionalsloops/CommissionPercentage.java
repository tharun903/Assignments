package conditionalsloops;
import java.util.*;

public class CommissionPercentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double salesAmount = sc.nextDouble();

        double rate;

        if (salesAmount < 10000) {
            rate = 0.05;
        } 
        else if (salesAmount < 50000) {
            rate = 0.10;
        } 
        else if (salesAmount < 100000) {
            rate = 0.20;
        } 
        else {
            rate = 0.30;
        }

        double commission = salesAmount * rate;

        System.out.println("Commission Rate: " + (rate * 100) + "%");
        System.out.println("Commission Amount: ₹" + commission);
    }
}
