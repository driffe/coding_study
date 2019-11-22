package Nov10;
/*
7) 정수 배열이 주어지면 첫 두 원소의 합을 구하시오.
 */
public class Work07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;

        if(arr.length >= 2) {
            sum = arr[0] + arr[1];
            System.out.print("The sum of first and second element: " + sum);
        } else {
            System.out.println("Enter the right array.");
        }
    }
}
