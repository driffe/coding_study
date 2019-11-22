package Nov10;
//20) 길이 3인 배열이 주어지면 가장 큰 원소를 리턴하시오
public class Work20 {
    public static void main(String[] args) {
        int[] data = {4,100,3};
        int temp = data[0];
        int max = data[0];
        if(data.length == 3) {
            for(int i = 0; i < data.length; i++) {
                if(temp < data[i]) {
                    max = data[i];
                    temp = data[i];
                }
            }
            System.out.print(max);
        } else {
            System.out.println("The array of length is not three!");

        }
    }
}
