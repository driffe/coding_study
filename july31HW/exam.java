package july31HW;

import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
//유저가 스트링 만들어서, 스트링안에 숫자만있으면 true, 문자가 하나라도 포함되면 false. 스트링의 사이즈는 5.
// input : "12345"
// output : true
// input : "a1234"
// output : false

        Scanner s = new Scanner(System.in);
        System.out.println("PUT A FIVE DIGIT OR ALPHABET : ");
        String input = s.nextLine();

        String [] arry = {"0123456789"};

        boolean istrue = false;
        for (int i = 0; i < input.length() ; i++) {
            istrue = false;
            for (int j = 0; j < arry[0].length(); j++) {
                if (input.charAt(i) == arry[0].charAt(j)) {
                    istrue = true;
                    break;
                }
            }
            if(!istrue) {
                break;
            }
        }
        System.out.print(istrue);
    }

}
