package july31HW;

import java.util.Scanner;

public class MHHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String getStr = sc.nextLine();
        System.out.print(result(getStr));
    }
    public static boolean result(String getStr) {
        boolean output = true;

        for(int i = 0; i < getStr.length(); i++) {
            if(!(getStr.charAt(i) == '1'|| getStr.charAt(i) == '2'|| getStr.charAt(i) == '3'|| getStr.charAt(i) == '4'|| getStr.charAt(i) == '5'||
                    getStr.charAt(i) == '6'|| getStr.charAt(i) == '7'|| getStr.charAt(i) == '8'|| getStr.charAt(i) == '9'|| getStr.charAt(i) == '0')) {
                output = false;
            }
        }
        return output;
    }
}
