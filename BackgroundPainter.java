import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

  // Helper method used to turn after each row
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();

      if (canMove()) {
        move();
      }

      turnLeft();
    }
  }

  // Paints the entire background
  public void paintBackground() {
    setPaint(1000);

    paint("black");
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    move();
    move();
    move();
    paint("black");

    move();
    paint("black");

    move();
    move();
    move();

    turnRight();
    move();
    turnRight();
    paintRow("black");

    turnToEast();
    paintRow("black");

    turnRight();
    move();
    turnRight();
    paintRow("black");
  }
}
