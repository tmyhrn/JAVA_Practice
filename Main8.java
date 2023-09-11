public class Main8 {
  public static void main(String[] args) {
    //勇者を生成し、フィールドに初期値を設定
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "(HP" + h.hp + ")" + "を生み出しました！");
    
    //お化けキノコを２体生成し、フィールドに初期値を設定
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';
    
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';
    System.out.println("お化けキノコ" + m1.suffix + "と、" + m2.suffix + "があらわれた！");
    
    //勇者とお化けキノコのメソッドを呼び出す
    h.slip();
    m1.run();
    m2.run();
    h.run();
  }
}