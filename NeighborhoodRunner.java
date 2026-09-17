import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
BackgroundPainter klara = new BackgroundPainter();
EyePainter joe = new EyePainter();

klara.paintBackground();
joe.paintEyes("plum", "orchid");
  }
}
