import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Yy/ Mm/ Dd: ");
            int getNum = sc.nextInt();

            int firstTWo = getNum / 10000;
            int month = (getNum % 10000) / 100;

            System.out.println(firstTWo);

            if(firstTWo >= 0 && firstTWo <= 19) {
                int year = 2000;

                if(month >= 0 && month <= 9) {
                    System.out.println(year + firstTWo + ".0" + month);
                } else if(month >= 10 && month <= 12){
                    System.out.println(year + firstTWo + "." + month);
                } else {
                    System.out.println("You enter wrong month");
                }
            } else if ( firstTWo >= 20 && firstTWo <= 99) {

                if(month >= 0 && month <= 9) {
                    System.out.println("19" + firstTWo + ".0" + month);
                } else if(month >= 10 && month <= 12){
                    System.out.println("19" + firstTWo + "." + month);
                } else {
                    System.out.println("You enter wrong month");
                }
            }
        }
    }
}
