public class Hero {
  String name;
  int hp;
  Sword sword;
  public void attack() {
    System.out.println(this.name + "は攻撃した！");
    System.out.println("敵に5ポイントのダメージを与えた");
  }
  public Hero() {
    this.hp = 100; //hpフィールドを100で初期化
  }
}