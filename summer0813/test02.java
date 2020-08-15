package summer0813;
class TV {
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}
class captionTV extends TV {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class test02 {
    public static void main(String[] args) {
        captionTV ctv = new captionTV();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World");
        ctv.caption = true;
        ctv.channelDown();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World");
    }
}
