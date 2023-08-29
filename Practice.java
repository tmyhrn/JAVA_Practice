//1〜10までの偶数が何個あるのか、偶数の合計は幾つになるかを表示させる
//偶数の個数をカウントする変数をcount、偶数の合計をする変数をsumとする
//for文を用い、初期値2から2ずつ合計し、countとsumにそれぞれ合計するようにしている
public class Practice {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    
    for (int i = 2; i <= 10; i += 2) {
      count ++;
      sum += i;
    }
    System.out.println("偶数の個数は" + count);
    System.out.println("偶数の合計は" + sum);
  }
}