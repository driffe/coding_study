package july31HW;

import java.util.Scanner;

public class ISHW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of first dice side: ");
        int firstdice = sc.nextInt();
        System.out.print("Number of second dice side: ");
        int secDice = sc.nextInt();
        System.out.print("There are " + result(firstdice, secDice) + " way(s) to get sum 10");
    }
    public static int result(int firstDice, int secDice) {
        int output = 0;
        for(int i = 1; i <= firstDice; i++) {
            for(int j = 1; j <= secDice; j++) {
                if(i + j == 10) {
                    output++;
                }
            }
        }
        return output;
    }
}
