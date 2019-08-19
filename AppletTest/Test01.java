package AppletTest;
import java.awt.*;
import java.applet.*;

public class Test01 extends Applet{
    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        g.drawString("Hello Applet.", 50, 50);
    }
}
