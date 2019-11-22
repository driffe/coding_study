package Nov1;

import java.util.Scanner;

/*
1)
숫자 N을 받고
N개의 이름을 받고
이름을 알파벳 순으로 정렬하여 프린트
오름차순 1번
내림차순 1번
 */
public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of name: ");
        int getLengthOfArr = sc.nextInt();
        String[] arr = new String[getLengthOfArr];
        System.out.println("Enter the name below");

        for(int i = 0; i < getLengthOfArr; i++) {
            arr[i] = sc.next();
        }
        System.out.println("If you want to see ascending order press(1) or descending order press(2)");
        int getOrder = sc.nextInt();
        if(getOrder == 1) {
            ascendingOrder(arr);
            printArr(arr);
        } else if(getOrder == 2) {
            descendingOrder(arr);
            printArr(arr);
        } else {
            System.out.println("You enter a wrong number!");
        }
    }
    public static void ascendingOrder(String[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j < i; j++) {
                if(arr[j].compareTo(arr[j+1]) > 0) {
                    swapElement(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
    public static void descendingOrder(String[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j < i; j++) {
                if(arr[j].compareTo(arr[j+1]) < 0) {
                    swapElement(arr, j, j+1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
    public static void swapElement(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
