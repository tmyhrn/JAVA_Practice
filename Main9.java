public class Main9 {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    System.out.println(h1.hp);
    
    Hero h2 = new Hero();
    h2.name = "アサカ";
    h2.hp = 100;
    
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}