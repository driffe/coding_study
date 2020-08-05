package summer805;

public class test01 {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    //static int cv2 = iv; 에러 클래스 변수는 인스턴스 변수로 사용 불가
    static int cv2 = new test01().iv;
    static void staticMethod() {
        System.out.println(cv);
        //System.out.println(iv); 에러 클래스메서드에서 인스턴스변수를 사용불가;
        test01 c = new test01();
        System.out.println(c.iv);
    }
    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);// 인스턴스메서드에서는 인스턴스변수를 바로 사용가능;
    }
    static void staticMethod02() {
        staticMethod();
        //instanceMethod1 에러 클래스메서드에서는 인스턴스 메서드를 호출 불가능;
        test01 c = new test01();
        c.instanceMethod1();
    }
    void instatnceMethod02() {
        staticMethod();
        instanceMethod1();
    }
}

/*
test01 c = new test01();
int result = c.instanceMethod1();
--------------------------------
이걸로 한줄 요약가능
int result = new test01().instanceMethod();
 */
