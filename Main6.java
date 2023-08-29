package calcapp.main;
//import calcapp.logics.Main6_1;
import calcapp.logics.*; //このように表記することも可能

public class Main6 {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = Main6_1.tasu(a, b);
    int delta = calcapp.logics.Main6_1.hiku(a, b);
    System.out.println("足すと" + total + "引くと" + delta);
  }
}