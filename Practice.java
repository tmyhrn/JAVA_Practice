//初期値を9とし、2ずつ減少させながらfor文を用いて繰り返し処理を行うようにして奇数表現
public class Practice {
  public static void main (String[] args) {
    for (int i = 9; i >= 1; i-=2) {
      System.out.println(i);
    }
  }
}