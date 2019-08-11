package Aus10;

public class gitTest {
    public static void main(String[] args) {
        int[][] data = {{1,2,3},{4,5,6}};

        for(int i = 0; i < data[0].length; i++) {
            int blank = data[1][i];
            data[1][i] = data[0][i];
            data[0][i] = blank;
        }
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]);
            }
        }
    }
}
