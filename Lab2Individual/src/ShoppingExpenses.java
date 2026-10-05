import java.util.Scanner;

public class ShoppingExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;
        System.out.print("Enter an amount (0 to stop): ");
        amount = scanner.nextInt();

        while (amount != 0) {
            total += amount;
            count++;

            System.out.print("Enter an amount (0 to stop): ");
            amount = scanner.nextInt();
        }
        System.out.println("Total Amount Spent: " + total);
        System.out.println("Number of items purchased = " + count);

    }
}