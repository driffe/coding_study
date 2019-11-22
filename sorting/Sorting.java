package sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 5, 4, -33, 4, 5, 6, 7, 8 };

        bubblesort(arr);
        //insertionsort(arr);
        //selectionsort(arr);
        printArr(arr);
    }
    public static void bubblesort(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    swappedElement(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;

            }
        }
    }
    public static void insertionsort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i;
            while(j >= 1 && arr[j] < arr[j - 1]) {
                swappedElement(arr, j, j - 1);
                j--;
            }
        }
    }
    public static void selectionsort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min_value = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min_value]) {
                    min_value = j;
                }
            }
            swappedElement(arr, i, min_value);
        }
    }
    public static void swappedElement(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ",");
        }
    }
}
