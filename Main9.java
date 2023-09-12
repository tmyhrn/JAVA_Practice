public class Main9 {
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト");
    System.out.println(h1.name);
    Hero h2 = new Hero();
    System.out.println(h2.name);
  }
}

//この方法でコンパイルすることは可能だが、効率が悪いから通常は利用しないとのこと