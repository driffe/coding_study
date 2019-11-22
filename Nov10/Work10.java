package Nov10;
/*
배열안에 1 또는 2가 있으면 TRUE, 없으면 FALSE
 */
public class Work10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean find = true;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 || arr[i] == 2) {
                find = false;
            }
        }
        System.out.print(find);
    }
}
