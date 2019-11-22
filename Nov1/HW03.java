package Nov1;

import java.util.Scanner;
/*
정수배열이 주어지면
MEDIAN 값을 프린트하시오
(길이가 짝수일 경우, 중간 2개의 원소의 평균값을 리턴)
소수점 나오게
 */
public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter even number: ");
        int lengthArr = sc.nextInt();
        int[] data = new int[lengthArr];
        System.out.println("Enter the number below");

        for(int i = 0; i < lengthArr; i++) {
            data[i] = sc.nextInt();
        }
        if(lengthArr % 2 == 0) {
            for(int i = 0; i < lengthArr - 1; i++) {
                int min_index = i;
                for(int j = i + 1; j < i; j++) {
                    if(data[j] < data[min_index]) {
                        min_index = j;
                    }
                }
                swapElement(data, i, min_index);
            }
            showMedian(data, lengthArr);
        } else {
            System.out.println("This is not even number: ");
        }

    }
    public static void swapElement(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void showMedian(int[] arr, int lengthArr) {
        int add = arr[lengthArr / 2] + arr[lengthArr / 2 - 1];
        System.out.println(add);
    }
}
