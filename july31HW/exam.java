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
        System.out.println("put a five digit or alphabet : ");
        String input = s.nextLine();

        String [] Arry = {"0123456789"};

        boolean isTrue = false;
        for (int i = 0; i < input.length() ; i++) {
            isTrue = false;
            for (int j = 0; j < Arry[0].length(); j++) {
                if (input.charAt(i) == Arry[0].charAt(j)) {
                    isTrue = true;
                    break;
                }
            }
            if(!isTrue) {
                break;
            }
        }
        System.out.print(isTrue);
    }

}
