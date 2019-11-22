package Nov10;
/*
13) 배열이 주어지면 원소들중에 2 다음에 바로 3이 나타나면 3을 0으로 바꾸시오.

{ 0, 1, 2, 3, 4 } -> { 0, 1, 2, 0, 4 }
{ 2, 3, 2, 3, 2 } -> { 2, 0, 2, 0, 2 }
 */
public class Work13 {
    public static void main(String[] args) {
        int[] data = {0,1,2,3,4};

        for (int i = 1; i < data.length; i++) {
            if(data[i - 1] == 2 && data[i] == 3) {
                data[i] = 0;
            }
        }
        printArr(data);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
