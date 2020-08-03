package summer727;

public class test03 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i< arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("Before");
        System.out.println("Arr length: " + arr.length);
        printArr(arr);

        int[] temp = new int[arr.length * 2];

//        for(int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
        //다른 표기법(array.copy)
        /*
        System.arraycopy(arr, 0, temp, 0, num.length);
         */
        System.arraycopy(arr, 0, temp, 0, arr.length);
        //arr의 0번쨰에서 temp의 0번쨰로 arr.length개의 데이터를 복사
        arr = temp;

        System.out.println("After");
        System.out.println("Arr length: " + arr.length);
        printArr(arr);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
