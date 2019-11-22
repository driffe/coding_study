package Nov10;
/*
1) 정수 배열이 주어지면 숫자 7이 배열 맨처음 또는 끝에 나타나면 TRUE, 아니면 FALSE를 프린트하시오
 */
public class Work01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,6};
        boolean find = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[0] == 7 || arr[arr.length - 1] == 7) {
                find = true;
            }
        }
        System.out.println(find);
    }
}
