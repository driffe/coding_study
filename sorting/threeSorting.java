package sorting;

public class threeSorting {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] data = { 1, 5, 3, 0, 2, 4 };
        printArr(data);

        bubbleSort(data);
        printArr(data);
        // 설명: https://hsp1116.tistory.com/33
        // selection sort - 선택정렬
        // insertion sort - 삽입정렬: https://marobiana.tistory.com/85
        // bubble sort - 버블정렬
    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    // 0 1 2 3 4 5
    public static void selectionSort(int[] arr) {
        // i번째 원소에 들어갈 놈을 찾는다.
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            // i 부터 배열 끝까지중에 가장 작은놈을 찾는다.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // 가장 작은놈과 i번째 원소를 교체한다.
            swapElements(arr, i, min_index);
        }
    }

    // 2 3 4 5 1 0
    public static void insertionSort(int[] arr) {
        // i 번째 있는 원소가 왼쪽으로 봤을때 맞는곳에 있는가?
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            // 왼쪽이 정렬되있다고 가정후, i번째 원소를 맞는곳에 넣어준다.
            while (j >= 1 && arr[j] < arr[j - 1]) {
                swapElements(arr, j, j-1);
                j--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

