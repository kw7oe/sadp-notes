public class Demo {
  public static void main(String[] args) {
    Subject subject = new Subject();

    new BinaryObserver(subject);
    new HexaObserver(subject);

    System.out.println("State change: 15");
    subject.setState(15);
  }
}