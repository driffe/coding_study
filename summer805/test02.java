package summer805;

public class test02 {
    public static void main(String[] args) {
        calculate mm = new calculate();
        System.out.println(mm.add(3,3));
        System.out.println(mm.add(3L,3));
        System.out.println(mm.add(3,3L));
        System.out.println(mm.add(3L,3L));
        int[] a = {100, 200, 300};
        System.out.println(mm.add(a));
    }
}
class calculate {
    int add(int a, int b) {
        System.out.println("int");
        return a + b;
    }
    long add(long a, int b) {
        System.out.println("front long");
        return a + b;
    }
    long add(int a, long b) {
        System.out.println("back long");
        return a + b;
    }
    long add(long a, long b) {
        System.out.println("both long");
        return a + b;
    }
    int add(int[] a) {
        System.out.println("int array");
        int sum = 0;
        for(int i : a) {
            sum += i;
        }
        return sum;
    }
}
