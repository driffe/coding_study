package Nov10;
/*
15) 배열 두개가 주어지면 배열의 합이 더 큰 배열을 프린트하시오

{ 0, 0, 2, 3, 4 }, { 99, 8, 7, 6 } -> 99, 8, 7, 6
 */
public class Work15 {
    public static void main(String[] args) {
        int[][] data = {{0,0,2,3,4}, {99,8,7,6}};
        int firstCount = 0;
        int secondCount = 0;

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                if(i == 0) {
                    firstCount = firstCount + data[i][j];
                } else if(i == 1) {
                    secondCount = secondCount + data[i][j];
                }
            }
        }
        if(firstCount > secondCount) {
            int i = 0;
            printArr(data, i);
        } else {
            int i = 1;
            printArr(data, i);
        }
    }
    public static void printArr(int[][] arr, int a) {
        for(int i = 0; i < arr[a].length; i++) {
            System.out.print(arr[a][i] + ",");
        }
    }
}
