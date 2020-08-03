package summer802;
class TV {
    String color;
    boolean power;
    int channel;

    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}
public class test03 {
    public static void main(String[] args) {
        TV t;
        t = new TV();

        t.channel = 7;
        t.channelDown();
        System.out.println("Channel: " + t.channel);
    }
}
