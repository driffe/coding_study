package Nov1;

import java.util.Scanner;

/*
정수 배열과 N이 주어지면
원소 두개끼리 합쳐서 N이 되는 모든 경우를 프린트하시오
{ 3, 4, 5, 7, 2, 6, 6 }, 10
----------
3, 7
4, 6
4, 6
 */

public class HW06 {
    public static void main(String[] args) {
        int[] data = { 3, 4, 5, 7, 2, 6, 6 };
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the num you want to get: ");
        int num = sc.nextInt();

        for(int i = 0; i < data.length - 1; i++) {
            for(int j = i + 1; j < data.length; j++) {
                int sum = data[i] + data[j];
                if(sum == num) {
                    System.out.println(data[i] + "," + data[j]);
                }
            }
        }
    }
}
