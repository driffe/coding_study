package Nov10;
/*
18) 배열이 주어지면 첫번째 원소와 마지막 원소를 바꾸시오
{ 4, 5, 6, 7 } -> { 7, 5, 6, 4 }
 */
public class Work18 {
    public static void main(String[] args) {
        int[] data = {4,5,6,7};
        swappedElement(data, 0, data.length - 1);
        printArr(data);
    }
    public static void swappedElement(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
