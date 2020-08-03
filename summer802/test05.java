package summer802;

public class test05 {
    public static void main(String[] args) {
        long a = 5;
        long b = 10;
        calculate nm = new calculate();
        long result = nm.add(a, b);

        System.out.println(result);
    }
}
class calculate {
    long add(long a, long b) {return a + b;}
    long substract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(long a, long b) {return a / b;}

}
