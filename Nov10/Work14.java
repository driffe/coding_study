package Nov10;
/*
14) 배열 두개가 주어지면 몇개의 배열에 1이 원소로 있는지 말하라. 명령이다.
{ 0, 1, 0 }, { 1, 2, 2 } -> 2
{ 1, 0, 0 }, { 0, 3, 4 } -> 1
{ 0, 0, 7 }, { 9, 8, 7 } -> 0
 */
public class Work14 {
    public static void main(String[] args) {
        int[][] data = {{ 0, 1, 0 }, { 1, 2, 2 }};
        int count = 0;

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                if(data[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.print("Num of 1: " + count);
    }
}
