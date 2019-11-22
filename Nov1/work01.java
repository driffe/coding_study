package Nov1;

public class work01 {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "orange", "lemon"};

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
    }
    public static void swappedElements(String[] arr, int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
