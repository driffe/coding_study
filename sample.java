import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int element = input.nextInt();
            array[i] = element;
        }

        System.out.println(solution(array));
        print(array);
    }
    public static int solution(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                array[i]++;
            } else if (array[i] < array[i - 1]) {
                array[i] = array[i - 1] + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }



    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
