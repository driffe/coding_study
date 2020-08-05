package summer805;

public class test03 {
    public static void main(String[] args) {
        String[] arr = {"100", "200", "300"};
        System.out.println(more("", "100", "200", "300" ));
        System.out.println(more("-", arr));
        System.out.println(more(",", new String[] {"a", "b", "c"}));
    }
    static String more(String sym, String... args) {
        String result = "";
        for(String str : args) {
            result += str + sym;
        }
        return result;
    }
}
