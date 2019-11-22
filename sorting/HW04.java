package sorting;

import java.util.Scanner;

public class HW04 {
    /*
    3,0,1,2
    0,1,2,3
    1,2,3,0
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arr: ");
        int length = sc.nextInt();
        int[] data = new int[length];
        int[] temp = new int[length];

        System.out.println("Enter the elements of array");

        for(int i = 0; i < length; i++) {
            data[i] = sc.nextInt();
        }
        System.out.print("Original arr: ");
        printArr(data);

        for(int i = 0; i < length; i++) {
            temp[i] = i;
        }
        insertionSort(data, temp);
        System.out.print("Result: ");
        printArr(data);
        printArr(temp);

    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void insertionSort(int[] data, int[] temp) {
        for(int i = 1; i < data.length; i++) {
            int j = i;
            while(j >= 1 && data[j] < data[j - 1]) {
                swapElements(data, j, j - 1);
                swapElements(temp, j, j - 1);
                j--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
