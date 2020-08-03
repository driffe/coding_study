package forTeachingStudying;

public class newIfandElse {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 1;
        int result;

        result = ((a > b)
                ? (a > c)
                ? a
                : c
                : (b > c)
                ? b
                : c);

        System.out.println(result);
    }
}
