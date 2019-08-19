package Aus10;

public class HW02 {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[arr.length - 1 - j][i]);
            }
            System.out.println();
        }
    }
}
/*
123      741
456 ---> 852
789      963
 */