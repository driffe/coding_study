package July13HW;

import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String getStr = sc.nextLine();

        char con1 = 'a';
        char con2 = 'e';
        char con3 = 'i';
        char con4 = 'o';
        char con5 = 'u';
        int count = 0;
        //whenever str satisfies con1~5, add 1
        for(int i = 0; i < getStr.length(); i++) {
            if(getStr.charAt(i) == con1 || getStr.charAt(i) == con2 || getStr.charAt(i) == con3 || getStr.charAt(i) == con4 || getStr.charAt(i) == con5) {
                count = count + 1;
            }
        }

        System.out.println("The number of vowels: " + count);
    }
}
