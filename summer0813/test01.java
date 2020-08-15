package summer0813;
class document {
    static int count = 0;
    String name;

    document() {
        this("No name" + ++count);
    }
    document(String name) {
        this.name = name;
        System.out.println("document " + this.name + " is created");
    }
}

public class test01 {
    public static void main(String[] args) {
        document d1 = new document();
        document d2 = new document("Java");
        document d3 = new document();
        document d4 = new document();

    }
}
