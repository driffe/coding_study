package jun8Homework;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        int num1 = sc.nextInt();
        int [] a = new int[num1];
        int i;
        int j;


        if(num1 < 1) {
            System.out.println("This isn't the positive number!");
        } else{
            System.out.println("Enter the number that you want to put in Array.");
            for( i = 0; i < num1; i++) {
                int num2 = sc.nextInt();
                a[i] = num2;
            }

            System.out.println("Now it will distinguish!");
            System.out.print("Enter the positive number: ");
            int num3 = sc.nextInt();

            if(num3 < 1) {
                System.out.println("This isn't the positive number!");
            }
            else {
                for(i = 0; i < num3; i++) {
                    int num4 = sc.nextInt();
                    boolean found = false;

                    for(j = 0; j < num1; j++) {
                        if(num4 == a[j]) {
                            found = true;
                        }
                    }
                    if(found) {
                        System.out.println("Exist");
                    } else {
                        System.out.println("Not Exist");
                    }
                }
            }

        }

    }
}
