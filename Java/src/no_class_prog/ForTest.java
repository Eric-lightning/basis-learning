public class ForTest {
    public static void main(String[] args){
        int i=0;
        System.out.println("<FOR START>");
        for(init();check(i);inc(i)){
            System.out.println(">>> ループ: i = "+i);
            i++;
        }
        System.out.println("<FOR END>");
    }
    static void init(){
        System.out.println("第1引数を実行(int i=0;相当)");
    }
    static boolean check(int i){
        System.out.println("第2引数を実行(i >= 3;相当)");
        return (i<=3);
    }
    static int inc(int i){
        System.out.println("第3引数を実行(i++ 相当)");
        return ++i;
    }
}
