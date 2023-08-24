public class Main5 {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    //add(10, 20)が30に、add(30, 40)が70に化け、合計で100となる
    System.out.println(add(add(10, 20), add(30, 40)));
  }
}