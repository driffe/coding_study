package Nov10;
/*
8) 홀수 길이의 정수 배열 두개가 주어지면 각 배열의 중간에 있는 원소들로 길이 2인 배열을 만들어서 리턴하시오.

{ 1, 2, 3 }, { 9, 8, 7 } -> { 2, 8 }
 */
public class Work08 {
    public static void main(String[] args) {
        int[] data1 = {1, 2, 3};
        int[] data2 = {9, 8, 7};
        int[] newData = new int[2];

        if(data1.length % 2 == 1 && data2.length % 2 == 1) {
            newData[0] = data1[data1.length / 2];
            newData[1] = data2[data2.length / 2];
        }
        printArr(newData);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
