public class Main5 {
  public static void main(String[] args) {
    System.out.println("メソッドの呼び出しを行います");
    hello("湊");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しを終了します");
  }
  public static void hello(String name) {
    System.out.println(name + "さん、こんにちは！");
  }
}