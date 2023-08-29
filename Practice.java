//1〜10までの整数をカンマ区切りで横並びで表示(10にはカンマをつけない)
//for文を用いて、初期値1から1ずつ数を増やしていき、10未満の場合はカンマで区切る
public class Practice {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.print(i);
      if (i < 10) {
        System.out.print(",");
      }
    }
  }
}