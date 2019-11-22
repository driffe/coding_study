package Nov10;
/*
12) 배열이 주어지면 그 배열의 두배인 길이를 가진 배열을 만든다음,
새로운 배열의 마지막 원소를 기존 배열의 마지막 원소의 값을 가지게 한다.
새로운 배열의 나머지 원소들은 다 값이 0이여야 한다

{ 1, 2, 3 } -> { 0, 0, 0, 0, 0, 3 }
 */
public class Work12 {
    public static void main(String[] args) {
        int[] data = {1,2,3};
        int[] newArr = new int[data.length * 2];

        for (int i = 0; i < newArr.length - 1; i++) {
            newArr[i] = 0;
        }
        newArr[newArr.length - 1] = data[data.length - 1];

        printArr(newArr);
    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
