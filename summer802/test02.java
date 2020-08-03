package summer802;

public class test02 {
    public static void main(String[] args) {
        int[][] score = {
                {10, 20, 30, 40},
                {30, 20, 70, 30},
                {60, 40, 20, 90}
            };
        int sum = 0;

        for(int[] temp : score) {
            for(int i : temp) {
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
