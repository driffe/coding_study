
import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();

        int numArr [] = new int[num];

        for(int i = 0; i < num; i++) {
            int numOfSeries = sc.nextInt();
            if(numOfSeries >= 1 && numOfSeries <= 20) {
                numArr[i] = numOfSeries;
            } else if(numOfSeries == -1) {
                System.out.println("End!");
                break;
            } else {
                System.out.print("Enter the correct number!");
                i--;
            }
        }
        for (int i = 0; i < numArr.length - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < numArr.length; j++) {
                if (numArr[j] < numArr[min_index]) {
                    min_index = j;
                }
            }
            swapElements(numArr, i, min_index);
        }
        int value;
        int sum = 0;
        int emptyNum = 0;

        for(int i = 0; i < numArr.length - 1; i++) {
            value = numArr[i+1] - numArr[i];
            if(value != 1 && value != 0) {
                sum = sum + value;
                for(int j = 1; j < value; j++) {
                    emptyNum = numArr[i] + value - j;
                    System.out.println("Missing num: " + emptyNum);
                }
            }

        }
        sum = sum - 1;
        System.out.println("this is " + sum);
    }

    public static void swapElements(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
