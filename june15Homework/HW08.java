package june15Homework;

import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for length of array: ");
        int num = sc.nextInt();
        int [] a = new int[num];
        int j = 0;
        while(j < a.length) {
            System.out.print("Enter the number: ");
            int num1 = sc.nextInt();
            a[j] = num1;
            j++;
        }
        int k = 0;
        System.out.print("The array is: ");
        while(k < a.length) {
            System.out.print(a[k] + ", ");
            k++;
        }
        System.out.println();
        int temp = a[0];
        int final_temp = a[0];
        int i = 1;

        while(i < a.length) {
            if(temp + a[i] < a[i]) {
                temp = a[i];
            } else {
                temp = temp + a[i];
            }
            if(final_temp < temp) {
                final_temp = temp;
            } else {
                final_temp = final_temp;
            }
            i++;
        }
        System.out.print("The Max Value of sum of array: " + final_temp);
    }
}
