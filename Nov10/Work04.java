package Nov10;
/*
4) 정수 배열이 주어지면 모든 원소의 합을 프린트 하시오
 */
public class Work04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
