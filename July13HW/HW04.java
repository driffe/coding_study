package July13HW;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter names: ");
        String getStr = sc.nextLine();
        //Split string if there is (,)
        String nameArr[] = getStr.split(",");
        System.out.println();
        //conditional statement that if there is third name, print third name. if doesn't, print there is nothing
        if(nameArr.length > 2) {
            System.out.println("Third name is: " + nameArr[2]);
        } else {
            System.out.println("There is no Third name!");
        }
    }
}
