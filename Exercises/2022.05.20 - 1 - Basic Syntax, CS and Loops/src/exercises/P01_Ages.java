package exercises;

import java.util.Scanner;

public class P01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        printAge(age);


    }

    private static void printAge(int age) {
        if (age < 0) {
            System.out.println("Invalid input");
        } else if (age <= 2) {
            System.out.println("baby");
        } else if (age <= 13) {
            System.out.println("child");
        } else if (age <= 19) {
            System.out.println("teenager");
        } else if (age <= 65) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
