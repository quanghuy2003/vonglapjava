package TH2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập 1 số : ");
        int number = scanner.nextInt();
        if (number <2 ){
            System.out.println(number + " Không phải là 1 số nguyên tố ");
        }else{
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là một nguyên tố ");
            else
                System.out.println(number + " Không phải là 1 số nguyên tố ");
        }
    }
}
