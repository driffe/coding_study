package Nov10;
/*
2) 정수 배열이 주어지면 맨 처음 원소랑 맨 끝 원소랑 값이 같으면 TRUE, 아니면 FALSE를 프린트 하시오
 */
public class Work02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        boolean find = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[0] == arr[arr.length - 1]) {
                find = true;
            }
        }
        System.out.println(find);
    }
}
