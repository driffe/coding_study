import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 3 - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
