package calcapp.main; //エラーが発生

public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
    //CalcLogicファイルに記載されている「tasu」と「hiku」を呼び出すために、「CalcLogic.」と記載している
    System.out.println("足すと" + total + "、引くと" + delta);
  }
}