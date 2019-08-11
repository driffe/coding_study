package june1Homework;

public class Test05 {
    public static void main(String[] args) {
        int [] a = {-1, 3, -1, 5};
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int max4 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int totalMax1 = 0;
        int totalMax2 = 0;
        int totalMax3 = 0;
        int totalMax4 = 0;
        int finalMax = 0;

        for(int i = 0; i < a.length - 1; i++) {
            max1 = a[0] + a[1];
            sum1 = a[i] + a[i + 1];
            if(sum1 >= max1) {
                totalMax1 = sum1;
            } else {
                totalMax1 = max1;
            }
        }

        for(int i = 0; i < a.length - 2; i++) {
            max2 = a[0] + a[1] + a[2];
            sum2 = a[i] + a[i+1] + a[i+2];
            if(sum2 >= max2) {
                totalMax2 = sum2;
            } else {
                totalMax2 = max2;
            }
        }

        if(totalMax1 > totalMax2) {
            finalMax = totalMax1;
        } else{
            finalMax = totalMax2;
        }

        for(int i = 0; i < a.length - 3; i++) {
            max3 = a[0] + a[1] + a[2] + a[3];
            sum3 = a[i] + a[i+1] + a[i+2] + a[i+3];
            if(sum3 >= max3) {
                totalMax3 = sum3;
            } else {
                totalMax3 = max3;
            }
        }

        if(totalMax3 > finalMax) {
            finalMax = totalMax3;
        }

        for(int i = 0 ; i < a.length; i++) {
            max4 = a[0];
            sum4 = a[i];
            if(sum4 >= max4) {
                totalMax4 = sum4;
            }else{
                totalMax4 = max4;
            }
        }

        if(totalMax4 > finalMax) {
            finalMax = totalMax4;
        }

        System.out.println(finalMax);
    }
}
