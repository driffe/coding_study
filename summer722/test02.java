package summer722;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //switch practice
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("This month is Spring.");
                break;
            case 6: case 7: case 8:
                System.out.println("This month is Summer.");
                break;
            case 9: case 10: case 11:
                System.out.println("This month is Fall.");
                break;
            case 12: case 1: case 2:
                System.out.println("This month is Winter.");
                break;
        }
    }
}
