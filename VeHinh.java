package BT2;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {

    int choice = 1;
    Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print inverted right triangles");
        System.out.println("4. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                System.out.println("* * * * * * * * * * * *");
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
                    break;
            case 3:
                for(int i=7;i>=1;i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.print("\n");
                }
                    break;
            case 4:
                for(int i = 1; i <= 6; i++) {
                for(int j = 1; j <= 6-i; j++) {
                    System.out.print("  ");
                }
                for(int k = 1; k <= 2*i-1; k++) {
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
    }
}
