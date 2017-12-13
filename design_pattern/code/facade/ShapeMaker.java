public class ShapeMaker {
  private Rectangle rectangle;
  private Square square;

  public ShapeMaker() {
    rectangle = new Rectangle();
    square = new Square();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawSquare() {
    square.draw();
  }
}