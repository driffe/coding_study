package Nov10;
/*
22) 배열 두개가 주어지면 새로운 길이 2 배열을 만들어서 각 배열의 길이를 넣으시오

{ 1, 2, 3, 4, 5}, { 0, 0, 7} -> { 5, 3 }
 */
public class Work22 {
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        int[] data2 = {0,0,7};
        int[] newData = {data1.length, data2.length};

        printArr(newData);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
