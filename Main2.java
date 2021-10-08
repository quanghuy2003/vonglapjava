package TH2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền đầu tư : ");
        money = input.nextDouble();
        System.out.println("Nhập số tháng : ");
        month = input.nextInt();
        System.out.println("Nhập lãi suất hàng năm theo tỷ lệ phần trăm: ");
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
