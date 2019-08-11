package july31HW;

import java.util.Scanner;

public class YSHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence: ");
        String getSen = sc.nextLine();
        System.out.print("Number of blank: " + blank(getSen));
    }
    public static int blank(String getSen) {
        int output = 0;
        for(int i = 0; i < getSen.length(); i++) {
            if(getSen.charAt(i) == ' ') {
                output++;
            }
        }
        return output;
    }
}
