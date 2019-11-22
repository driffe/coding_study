package Nov10;
/*
19) 홀수 길이의 배열이 주어지면 중간 3개의 원소로 새로운 배열을 만들어서 리턴하시오

{ 1, 2, 3, 4, 5, 6, 7 } -> { 3, 4, 5 }
 */
public class Work19 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7};
        int[] newData = new int[3];

        if(data.length % 2 == 1) {
            for(int i = data.length / 2 - 1; i <= data.length / 2 + 1; i++) {
                newData[i - (data.length / 2 - 1)] = data[i];
            }
        } else{
            System.out.print("This is not odd length of array.");
        }
        printArr(newData);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
