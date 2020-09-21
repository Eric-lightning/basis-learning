public class ScopeTest{
  static int hogebar = 10; // クラス変数
  int hogefoo = 10; //メンバー変数
  public static void main(String[] args){
    int hogebar = 100;
    System.out.println("hogebar ->"+ hogebar);
    ////////////////////////////////
    // インスタンス生成
    ScopeTest instance = new ScopeTest();
    System.out.println("instance.hogefoo ->"+ instance.hogefoo);
    instance.printHoge();
    System.out.println("instance.hogefoo ->"+ instance.hogefoo);
  }
  ////////////////////////////////////
  // インスタンスメソッドの場合
  void printHoge(){
    int hogefoo = 1;
    System.out.println("hogefoo ->"+ hogefoo);
    System.out.println("this.hogefoo ->"+ this.hogefoo);
    this.hogefoo = 10000;
    System.out.println("this.hogefoo ->"+ this.hogefoo);
  }
}
