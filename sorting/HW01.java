package sorting;

public class HW01 {
    public static void main(String[] args) {
        int[] data = {1, 5, 3, 4, 8, 0};

        System.out.print("Original Arr: ");
        printArr(data);
        System.out.print("Changed Arr: ");
        halfSelectionSort(data);
        halfInsertionSort(data);
        printArr(data);
    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void halfSelectionSort(int[] arr) {
        for(int i = 0; i < arr.length / 2 - 1; i++) {
            int minValue = i;
            for(int j = i + 1; j <= arr.length / 2 - 1; j++) {
                if(arr[j] < arr[minValue]) {
                    minValue = j;
                }
            }
            swapElements(arr, i, minValue);
        }
    }

    public static void halfInsertionSort(int[] arr) {
        for(int i = arr.length / 2; i < arr.length; i++) {
            int j = i;
            while(j >= arr.length / 2 && arr[j] > arr[j - 1]) {
                swapElements(arr, j, j - 1);
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
