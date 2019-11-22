package Nov10;
/*
9) 배열이 주어지면 첫번쨰 원소, 마지막 원소로 길이 2인 배열을 만들어서 리턴하시오
 */
public class Work09 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        int[] newArr =  new int[2];

        if(data.length >= 2) {
            newArr[0] = data[0];
            newArr[1] = data[data.length - 1];
        }
        printArr(newArr);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
