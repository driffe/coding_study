
import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();

        System.out.print("Enter the column: ");
        int column = sc.nextInt();

        int arr[][] = new int[row][column];
        int num = 1;
        int flag = 1;
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            while (j < arr[i].length) {
                arr[i][j] = num;
                num++;
                if (j == arr[i].length - 1) {
                    j = arr[i].length - 1;
                    break;
                }
                j++;
            }
            i++;
        }
        i--;
        System.out.println(i + "," + j);
        while(i >= 0) {
            while(j >= 0) {
                arr[i][j] = num;
                num++;
                j--;
            }
            i--;
        }

        System.out.println("Flag: " + flag);
        for (int l = 0; l < arr.length; l++) {
            for (int k = 0; k < arr[l].length; k++) {
                System.out.println((l + 1) + "," + (k + 1) + "=" + arr[l][k]);
            }

        }
    }
}
