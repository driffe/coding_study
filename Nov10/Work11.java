package Nov10;
/*
1)  배열안에 1 또는 2가 없으면 TRUE, 있으면 FALSE
 */
public class Work11 {
    public static void main(String[] args) {
        int[] arr = {3,3,3,4};
        boolean find = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 || arr[i] == 2) {
                find = false;
            }
        }
        System.out.print(find);
    }
}
