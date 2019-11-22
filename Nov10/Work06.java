package Nov10;
/*
6) 정수 배열이 주어지면 모든 원소의 값을 배열에서 가장 큰 원소의 값으로 바꾸시오.
 */
public class Work06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int max = arr[0];
        int temp = 0;
        for(int i = 1; i < arr.length; i++) {
            temp = arr[i];
            if(max < temp) {
                max = temp;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = max;
            System.out.print(arr[i] + ",");
        }
    }
}
