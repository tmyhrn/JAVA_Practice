//フィボナッチ数列(から始まるパターン)

public class Practice {
  public static void main(String[] args) {
    int f1, f2, fn;
    
    f1 = 1;
    System.out.println(f1);
    
    f2 = 1;
    System.out.println(f2);
    
    for (int i = 2; i < 10; i++) {
      fn = f1 + f2;
      System.out.println(fn);
      f1 = f2;
      f2 = fn;
    }
  }
}