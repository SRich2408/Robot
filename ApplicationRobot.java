import java.awt.*;
import  java.awt.event.InputEvent;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 
import javax.imageio.ImageIO;
public class ApplicationRobot{
    public static void main(String[] args) throws Exception{
        Robot Seb = new Robot();
        Seb.mouseMove(0,1200);
        Seb.setAutoDelay(1000);
        Seb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Seb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Seb.setAutoDelay(300);
        Seb.mouseMove(100,720);
        Seb.setAutoDelay(1000);
        Seb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Seb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Seb.setAutoDelay(3000);
        Seb.mouseMove(1200,500);
        Seb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Seb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Seb.setAutoDelay(2000);
        Seb.mouseMove(1200,900);
        Seb.setAutoDelay(600);
        Seb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Seb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Seb.setAutoDelay(2000);
        Seb.mouseMove(735,85);
        Seb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Seb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Seb.setAutoDelay(2000);
        Seb.mouseMove(735,200);
        Seb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Seb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= Seb.createScreenCapture(bounds);
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 

    }
}