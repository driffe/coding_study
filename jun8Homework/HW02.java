package jun8Homework;

public class HW02 {
    public static void main(String[] args) {
        int [] a = {-1, 3, 11, 5};
        int totalMax = a[0];
        int sum = a[0];
        int currentNum = a[0];

        for(int i = 1; i < a.length; i++) {
            sum = totalMax + a[i];
            currentNum = a[i];
            if(currentNum > totalMax) {
                totalMax = currentNum;
            } else {
                totalMax = a[0];
            }
            if(totalMax < sum) {
                totalMax = sum;
            }
        }
        System.out.print("The result: " + totalMax);
    }
}
