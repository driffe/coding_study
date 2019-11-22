package sorting;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first arr: ");
        int firstLength = sc.nextInt();
        System.out.println("Enter the elements of first arr");
        int[] firstArr = new int[firstLength];
        putElements(firstArr);

        System.out.print("Enter the length of second arr: ");
        int secondLength = sc.nextInt();
        System.out.println("Enter the elements of second arr");
        int[] secondArr = new int[secondLength];
        putElements(secondArr);

        int[] finalArr = new int[firstLength + secondLength];
        finalElements(firstArr, secondArr, finalArr);
        selectionSorting(finalArr);
        printArr(finalArr);
    }

    public static void finalElements(int[] firstArr, int[] secondArr, int[] finalArr) {
        for(int i = 0; i < firstArr.length; i++) {
            finalArr[i] = firstArr[i];
        }
        for(int j = firstArr.length; j < finalArr.length; j++) {
            finalArr[j] = secondArr[j - firstArr.length];
        }
    }

    public static void putElements(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void selectionSorting(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minValue = i;
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValue]) {
                    minValue = j;
                }
            }
            swapElements(arr, i, minValue);
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
