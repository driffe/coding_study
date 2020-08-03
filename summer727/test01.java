package summer727;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        //do while
        Scanner sc = new Scanner(System.in);
        System.out.print("삼육구 끝 번호를 입력하시오: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.print("i == " + i + " ");

            int temp = i;

            do{
                if(temp % 10 % 3 == 0 && temp % 10 != 0) {
                    System.out.print("짝");
                }

            } while((temp /= 10) != 0);
            System.out.println();
        }


    }
}
