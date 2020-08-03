package summer722;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        int i = num;
        //while 문을 사용할떄 감소나 증가식을 ()괄호안에 사용 가능
        while(i-- != 0 ) {
            System.out.println(i + "- I can do it.");
        }

    }
}
