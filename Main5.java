public class Main5 {
  public static void main(String[] args) {
    String title = "こんにちは！";
    String address = "example@example.com";
    String text = "お久しぶりです！";
    email(title, address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "さんにメールを送信");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}