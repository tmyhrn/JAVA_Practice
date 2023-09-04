//1〜10の数字の偶数のみを大きい順に上から縦に並ぶように表示させる

public class Practice {
  public static void main(String[] args) {
    for (int i = 10; i > 1; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}

//以前と異なり、iを初期値10と定義し、1ずつ減らしていき、1になるまで減らし続ける
//そして、iの余りが出ない場合(これが偶数)に、その数字を