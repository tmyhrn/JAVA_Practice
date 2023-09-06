//要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる問題

public class Practice {
  public static void main(String[] args) {
    //配列の宣言
    int[] array = new int [20];
    //array[i]について定義
    for (int i = 0; i < 20; i++) {
      array[i] = i * 5;
    }
    //1〜10の中で奇数を表示
    for (int i = 0; i <= 10; i ++) {
      if (array[i] % 2 != 0) {
        System.out.print(array[i]);
        if (i <= 10) {
          System.out.print(",");
        }
      }
    }
    //11〜20の中で偶数を表示
    for (int i = 11; i < 20; i++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i]);
        if (i < 20) {
          System.out.print(",");
        }
      }
    }
  }
}