//Heroクラスの継承を行う
public class SuperHero extends Hero {
  boolean flying;
  //戦うメソッド(オーバーライド)
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた！");
    if (this.flying) {
      System.out.println(this.name + "の追加攻撃！");
      m.hp -= 5;
      System.out.println("5ポイントのダメージを与えた！");
    }
  }
  //飛ぶメソッド
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  //着地するメソッド
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
  //逃げるメソッド(オーバーライド)
  public void run() {
    System.out.println(this.name + "は撤退した！");
  }
}