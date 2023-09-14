//Heroクラスの継承を行う
public class SuperHero extends Hero {
  boolean flying;
  
  public SuperHero() {
    System.out.println("SuperHeroのコンストラクタが動作");
  }
  //戦うメソッド(オーバーライド)
  public void attack(Matango m) {
    super.attack(m); //親インスタンス部分のattack()を呼び出している
    if (this.flying) {
      super.attack(m); //親インスタンス部分のattack()を呼び出している
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