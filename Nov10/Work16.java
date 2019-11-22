package Nov10;
/*
16) 짝수 길이 배열이 주어지면 중간 두 원소를 따로 배열로 만드시오

{ 1, 2, 3, 4 } -> { 2, 3 }
{ 5, 4, 6, 7, 3, 8 } -> { 6, 7 }
{ 0, 1 } -> { 0, 1 }
 */
public class Work16 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4};
        int[] newData = new int[2];

        if(data.length % 2 == 0) {
            for(int i = 0; i < newData.length; i++) {
                newData[i] = data[data.length / 2 - 1 + i];
            }
        } else {
            System.out.println("This is not even array.");
        }
        printArr(newData);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
