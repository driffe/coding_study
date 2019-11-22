package Nov10;
/*
17) 배열 두개가 주어지면 두개의 배열을 합치시오
{ 2, 3, 4, 5 }, { 0, 0, 1} -> { 2, 3, 4, 5, 0, 0, 1 }
 */
public class Work17 {
    public static void main(String[] args) {
        int[] data1 = {2,3,4,5};
        int[] data2 = {0,0,1};
        int[] finalData = new int[data1.length + data2.length];

        for(int i = 0; i < data1.length; i++) {
            finalData[i] = data1[i];
        }
        for(int i = data1.length; i < finalData.length; i++) {
            finalData[i] = data2[i - data1.length];
        }
        printArr(finalData);
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
