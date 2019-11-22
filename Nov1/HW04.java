package Nov1;

import java.util.Scanner;

/*
String배열과 String이 주어지면
주어진 String이 배열안에 몇개 존재하는지
리턴하시오.
 */
public class HW04 {
    public static void main(String[] args) {
        String[] data = {"apple", "banana", "apple", "pineapple", "avocado"};
        System.out.println(data);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of fruit: ");
        String str = sc.next();
        int num = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i].compareTo(str) == 0) {
                num++;
            }
        }
        if(num == 0) {
            System.out.println(str + " <-It doesn't exist");
        } else {
            System.out.println(str + " <- There is " + num + " in arr");
        }
    }
}
