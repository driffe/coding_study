package summer0823;

public class test01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        System.out.println(p.x);
        System.out.println(c.x);
    }
}
class Parent {
    int x = 100;
    void method() {
        System.out.println("This is Parent");
    }
}
class Child extends Parent {
//    int x = 200;
//    void method() {
//        System.out.println("This is Child");
//    }
}
