package june15Homework;

import java.util.Scanner;

public class ExtraProblem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter the positive integer: ");
            int num = sc.nextInt();
            int i = 0;
            int sum = 0;
            while(i <= num) {
                sum = sum + i;
                i++;
            }
            if(num < 0) {
                System.out.print("This is not a positive number!");
                break;
            } else if(num == 0) {
                System.out.print("The System is over!");
                break;
            }
            System.out.println(sum);
        }
    }
}
