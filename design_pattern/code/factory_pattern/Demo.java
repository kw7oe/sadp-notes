public class Demo {
  public static void main(String[] args) {
    ShapeFactory factory = new ShapeFactory();

    factory.getShape("SQUARE").draw();
    factory.getShape("RECTANGLE").draw();
  }
}