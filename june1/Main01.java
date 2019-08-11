package june1;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        int num;
        for(int i=1; i<=number; i++) {
            for(int j=1; j<=i; j++) {
                for(num=j; num>1; num-=2) {
                }
                if(num==0) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

    }
}
