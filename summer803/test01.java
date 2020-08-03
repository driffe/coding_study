package summer803;
class data {int x;}
public class test01 {
    //기본형 매개변수 (값 읽기만 가능하고 변경 불가능)
    public static void main(String[] args) {
        data d = new data();
        d.x = 10;
        System.out.println("Main: " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("Main: " + d.x);
    }
    static void change(int x) {
        x = 1000;
        System.out.println("Change: " + x);
    }
}
