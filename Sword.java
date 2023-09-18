public class Sword {
  String name;
  int damage;
  
  public void heal(Hero h) {
    h.hp += 10;
    System.out.println(h.name + "のHPを10回復した！");
  }
}