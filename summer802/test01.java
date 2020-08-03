package summer802;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        System.out.println("사칙연산 시작!");
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.next();
        }
        int num1 = Integer.parseInt(arr[0]);
        char sym = arr[1].charAt(0);
        int num2 = Integer.parseInt(arr[2]);
        int result = 0;

        switch(sym) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("사칙연산자중 하나가 아닙니다!");
        }
        System.out.println("Result: " + result);

    }
}
