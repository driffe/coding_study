package summer803;
class Data {int x;}
public class test02 {
    //참조 매개변수 (값 읽기만 가능하고 변경 가능)
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("Main: " + d.x);

        change(d);
        System.out.println("After change(d.x)");
        System.out.println("Main: " + d.x);
    }
    static void change(Data d) {
        d.x = 1000;
        System.out.println("Change: " + d.x);
    }
}

