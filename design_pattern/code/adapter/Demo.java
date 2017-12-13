public class Demo {
  public static void main(String[] args) {
    Adapter adapter = new SocketAdapter();

    adapter.get120Volt();
    adapter.get12Volt();
    adapter.get3Volt();
  }
}