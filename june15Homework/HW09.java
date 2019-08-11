package june15Homework;

import java.util.Scanner;

public class HW09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array: ");
        int num1 = sc.nextInt();
        if(num1 < 0) {
            System.out.println("Error: This is not positive integer");
        } else {
            int [] a = new int[num1];
            int i = 0;
            System.out.println("Enter the number(s) to put into array!");
            while(i < num1) {
                int num2 = sc.nextInt();
                a[i] = num2;
                i++;
            }
            int k = 0;
            System.out.print("The array is { ");
            while(k < a.length) {
                System.out.print(a[k]);
                k++;
                if(k == a.length) {
                    System.out.print(" }");
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println("Now time to find number exist.");
            System.out.print("Enter the positive integer: ");
            int num3 = sc.nextInt();
            if(num3 < 0) {
                System.out.print("Error: This is not positive integer");
            }
            System.out.println("You can enter the number " + num3 + " time(s)");
            i = 0;
            while(i < num3){
                boolean found = false;
                int j = 0;
                int num4 = sc.nextInt();
                while(j < a.length) {
                    if(num4 == a[j]) {
                        found = true;
                    }
                    j++;
                }
                if(found) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not found");
                }
                i++;
            }
        }
    }
}
