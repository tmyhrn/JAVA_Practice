//1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる
//初期値を10とし、2ずつ減少させながらfor文を用いて繰り返し処理を行うようにして表現
public class Practice {
  public static void main(String[] args) {
    for (int i = 10; i >= 2; i -= 2) {
        System.out.println(i);
    }
  }
}