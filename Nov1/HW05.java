package Nov1;

import java.util.Scanner;
/*
String 배열이 주어지면
가장 많이 존재하는 원소 값을 프린트하시오
Apple Apple Banana Apple Diq
--------
Apple
 */
//String[] data = {"Apple", "Apple", "Banana", "Apple", "Diq", "Banana", "Banana", "Banana"};
public class HW05 {
    public static void main(String[] args) {
        String[] data = {"Apple", "Apple", "Banana", "Apple", "Diq", "Banana", "Banana", "Banana"};
        for(int i = data.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j < i; j++) {
                if(data[j].compareTo(data[j + 1]) > 0) {
                    swappedElements(data, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
        printArr(data);
        int tempI = 0;
        int max = 0;
        String mostFrequency = data[0];
        for(int i = tempI; i < data.length; i++) {
            int num = 1;
            System.out.println("I: " + tempI);
            for(int j = i + 1; j < data.length; j++) {
                if(data[i].compareTo(data[j]) == 0) {
                    num++;
                } else {
                    if(max < num) {
                        System.out.println("Num:" + num);
                        max = num;
                        System.out.println("Max: " + max);
                        num = 1;
                        tempI = j;
                        mostFrequency = data[i];
                    }
                }
            }
            if(tempI == data.length - 1) {
                break;
            }
        }
        System.out.print(mostFrequency + ": " + max);
    }
    public static void swappedElements(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
