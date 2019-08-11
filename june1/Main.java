package june1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        int max=0;
        int min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        number1 = input.nextInt();

        for(int i=1; i<=number1; i++) {
            number2 = input.nextInt();
            if(i==1) {
                max=number2;
                min=number2;
            }else if(number2>max) {
                max=number2;
            }else if(number2<min) {
                min=number2;
            }
            System.out.println("Max:"+max);
            System.out.println("Min:"+min);
        }
    }
}
