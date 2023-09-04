//1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題

public class Practice {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    for (int i = 2; i <= 10; i += 2) {
      count ++;
      sum += i;
    }
    System.out.println("偶数の数；" + count);
    System.out.println("偶数の合計：" + sum);
  }
}