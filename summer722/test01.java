package summer722;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        //조건식 ? 삭1 : 식2;

        Scanner sc = new Scanner(System.in);
        System.out.print("5 - 3 = ");
        int ans = sc.nextInt();
        findAns(ans);
    }
    public static void findAns (int ans) {
        int result;

        result = (ans == 2) ? 1 : -1;

        if(result == 1) {
            System.out.println("Answer!!");
        } else {
            System.out.println("Wrong!!");
        }
    }
}
