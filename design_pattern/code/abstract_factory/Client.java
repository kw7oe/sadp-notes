public class Client {
  public static void main(String[] args) {
    AbstractFactory factory = new ColorFactory();

    factory.getColor("RED").fill();
    factory.getColor("BLUE").fill();

    factory = new ShapeFactory();
    factory.getShape("SQUARE").draw();
    factory.getShape("RECTANGLE").draw();
  }
}