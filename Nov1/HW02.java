package Nov1;

import java.util.Scanner;

/*
숫자 N을 받고
이름(문자)과 성적(정수)을 N개 받는다

가장 성적이 좋은 사람과
가장 성적이 나쁜 사람의 이름을 프린트
 */
public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of length of array: ");
        int getLengthOfArr = sc.nextInt();
        String[] nameData = new String[getLengthOfArr];
        int[] scoreData = new int[getLengthOfArr];
        System.out.println("Enter the names and scores below");
        for(int i = 0; i < getLengthOfArr; i++) {
            System.out.print("Enter the name: ");
            nameData[i] = sc.next();
            System.out.print("Enter the score: ");
            scoreData[i] = sc.nextInt();
        }
        for(int i = 0; i < getLengthOfArr - 1; i++) {
            int min_index = i;
            for(int j = i + 1; j < getLengthOfArr; j++) {
                if(scoreData[j] < scoreData[min_index]) {
                    min_index = j;
                }
            }
            swapStrElement(nameData, i, min_index);
            swapIntElement(scoreData, i, min_index);
        }
        printArr(nameData, getLengthOfArr);

    }
    public static void swapStrElement(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void swapIntElement(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(String[] arr, int getLengthOfArr) {
        System.out.println("Best Student: " + arr[getLengthOfArr - 1]);
        System.out.println("Worst Student: " + arr[0]);
    }
}
