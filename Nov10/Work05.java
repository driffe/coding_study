package Nov10;
/*
5) 정수 배열이 주어지면 배열을 거꾸로 하시오 { 1, 2, 3 } -> { 3, 2, 1 }
 */
public class Work05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] reversedArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(reversedArr[i] + ",");
        }
    }
}
