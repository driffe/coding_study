package july31HW;

import java.util.Scanner;

public class SCHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number which length is odd: ");
        String getNum = sc.nextLine();

        System.out.println(getNum.charAt(getNum.length() / 2));
        for(int i = 0; i < getNum.length() / 2; i++) {
            System.out.println(getNum.charAt(i) + "," + getNum.charAt(getNum.length() - i - 1));
        }
    }
}
