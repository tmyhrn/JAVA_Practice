//1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる問題

public class Practice {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    for (int i = 1; i < 11; i ++) {
      if (i % 2 == 0) {
        count++;
        sum += i; 
      }
    }
    System.out.println(count);
    System.out.println(sum);
  }
}