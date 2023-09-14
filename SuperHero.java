//Heroクラスの継承を行う
public class SuperHero extends Hero {
  boolean flying;
  //戦うメソッド・逃げるメソッドは継承しているので記述する必要がない
  
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
}