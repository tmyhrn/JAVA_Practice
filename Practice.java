//1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる

public class Practice {
  public static void main(String[] args) {
    for (int i = 10; i > 1; i --) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}