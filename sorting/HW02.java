package sorting;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array (length >= 3): ");
        int length = sc.nextInt();
        if(length < 3) {
            System.out.println("Wrong length!");
        } else {
            int[] data = new int[length];
            System.out.println("Enter the elements of array");

            for(int i = 0; i < length; i++) {
                data[i] = sc.nextInt();
            }
            System.out.print("Original Arr: ");
            printArr(data);
            insertionSort(data);

            System.out.print("Value of adding Big 3: " + addBigThree(data));

        }
    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void insertionSort(int[] arr) {
        for(int i = 1; i < 4; i++) {
            int j = i;
            while(j >= 1 && arr[j] > arr[j - 1]) {
                swapElements(arr, j, j - 1);
                j--;
            }
        }
    }

    public static int addBigThree(int[] arr) {
        int addValue = 0;

        addValue = arr[0] + arr[1] + arr[2];

        return addValue;
    }

    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
