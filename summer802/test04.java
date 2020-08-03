package summer802;

public class test04 {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 2;

        System.out.println(c1.kind + "," + c1.number + "," + c1.width + "," + c1.height);
        System.out.println(c2.kind + "," + c2.number + "," + c2.width + "," + c2.height);
        //여기에서 전체 높이와 넓이의 크기가 변한다 (클래스 변수를 사용했기떄문)
        c2.width = 50;
        c2.height = 100;

        System.out.println(c1.kind + "," + c1.number + "," + c1.width + "," + c1.height);
        System.out.println(c2.kind + "," + c2.number + "," + c2.width + "," + c2.height);
    }
}
class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
