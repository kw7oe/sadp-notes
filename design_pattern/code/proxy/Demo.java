public class Demo {
  public static void main(String[] args) {
    Image image = new ProxyImage("test.jpg");

    image.display();
    System.out.println();

    // Image will not be loaded from disk again
    image.display();
  }
}