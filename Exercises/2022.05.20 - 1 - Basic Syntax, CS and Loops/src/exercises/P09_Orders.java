package exercises;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());;
        double totalPrice = 0;

        for (int i = 0; i < ordersCount; i++){
            double capsulePrice = Double.parseDouble(scanner.nextLine());;
            int days = Integer.parseInt(scanner.nextLine());;
            int capsulesCount = Integer.parseInt(scanner.nextLine());;

            double orderPrice = days * capsulesCount * capsulePrice;
            totalPrice += orderPrice;
            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
