public class Main4 {
  public static void main(String[] args) {
    int [] seq = new int[10];
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    
    //変更後
    for (int i = 0; i < seq.length; i++) {
      char [] base = {'A', 'T', 'G', 'C'};
      System.out.println(base[seq[i]] + "");
    }
    /* 変更前
      switch(seq[i]) {
        case 0:
          System.out.println("A");
          break;
        case 1:
          System.out.println("T");
          break;
        case 2:
          System.out.println("G");
          break;
        case 3:
          System.out.println("C");
          break;
      }
    }
    */
  }
}