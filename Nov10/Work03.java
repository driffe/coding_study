package Nov10;
//3) 배열 두개가 주어지면 두 배열의 첫 원소 또는 끝 원소가 같은 값이면 TRUE, 아니면 FALSE 프린트
public class Work03 {
    public static void main(String[] args) {
        int[] firstArr = {1,2,3,4,5,6};
        int[] secondArr = {9,8,7,5,4,4};
        boolean find = false;
        if(firstArr[0] == secondArr[0] || firstArr[firstArr.length - 1] == secondArr[secondArr.length - 1]) {
            find = true;
        }
        System.out.println(find);
    }
}
