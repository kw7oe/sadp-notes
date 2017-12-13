public class SocketAdapter extends Socket implements Adapter {

  public void get120Volt() {
    System.out.println("Volt: " + getVolt());
  }

  public void get12Volt() {
    System.out.println("Volt: " + getVolt() / 10);
  }

  public void get3Volt() {
    System.out.println("Volt: " + getVolt() / 40);
  }
}