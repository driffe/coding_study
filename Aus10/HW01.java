package Aus10;

public class HW01 {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][]newArr = new int [3][3];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
               newArr[arr.length - 1 - i][arr[0].length - 1 - j] = arr[i][j];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(newArr[i][j]);
            }
            System.out.println();
        }
    }
}
/*
123      987
456 ---> 654
789      321
 */