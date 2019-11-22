package Nov10;
/*
21) 배열이 주어지면 첫번째 3개의 원소로 새로운 배열을 만드시오. 주어진 배열이 길이 3보다 작다면 존재하는 원소로만 리턴하시면 됩니다

{ 1, 2, 3, 4 } -> { 1, 2, 3 }
{ 1 } -> { 1 }
{ 1, 2 } -> { 1, 2 }
 */
public class Work21 {
    public static void main(String[] args) {
        int[] data = {1,2};
        int[] newData = new int[0];
        if(data.length >= 3) {
            newData = new int[3];
            makeNew(newData, data);
        } else {
            newData = new int[data.length];
            makeNew(newData, data);
        }
        printArr(newData);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
    public static void makeNew(int[] arr, int[] data) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = data[i];
        }
    }
}
