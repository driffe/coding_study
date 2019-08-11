package june1;

import java.util.Scanner;

public class forLoopTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the positive integer:");
        int num = s.nextInt();
        if(num<= 0){
            System.out.println("Error: This is not positive integer");
        }
        int multi= 1;

        for(int i= 1; i<= num; i++){
            multi = multi * i;
        }
        if(num> 0){
            System.out.println("This is a result of multiply 1 to " + num + "=" + multi);
        }
    }
}
