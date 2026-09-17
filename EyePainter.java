import org.code.neighborhood.*;

public class EyePainter extends PainterPlus {

  public void paintEyes(String color1, String color2) {
 setPaint(100);
    
    turnRight();
    move();
    move();
    move();
    move();
  turnLeft();
    
    //paint the first eye
   paint(color1);
    move();
    paint(color2);
    move();
    paint(color1);
    
    move();
    move();
    move();
    
    //paint the second eye
    paint(color1);
    move();
    paint(color2);
    move();
    paint(color1);
  }
}
