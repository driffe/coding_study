package summer808;
class laptop {
    String color;
    String type;
    int size;
    laptop() {
        this("grey", "Air", 13);
    }
    laptop(String color) {
        this(color, "Air", 13);
    }
    laptop(String color, String type, int size) {
        this.color = color;
        this.type = type;
        this.size  = size;
    }
}
public class test02 {
    public static void main(String[] args) {
        laptop l1 = new laptop();
        laptop l2  =new laptop("silver");

        System.out.println(l1.color + "," + l1.type + "," + l1.size);
        System.out.println(l2.color + "," + l2.type + "," + l2.size);
    }
}
