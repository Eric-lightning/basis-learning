public class RecursionTest{
    public static void main(String[] args){
        //最初の呼出
        int res = bar(1,1,100);
        //再帰の終了
        System.out.println("終了 - res = "+ res);
    }
    static int bar(int src,int cnt,int stopper){
        System.out.println(cnt + ":呼出 - bar("+src+"."+cnt+","+stopper+")");
        int ans = src * 2;
        System.out.println(cnt + ":計算 - "+ src  + " * 2 = " + ans + "(2^"+cnt+")");
        //変数`stopper`よりも小さいなら再帰呼出
        System.out.println(cnt + ":条件 - "+ ans  + " <= " + stopper + "(" + ( ans <= stopper ) + ")");
        if (ans <= stopper){
            //再帰呼出
            int res = bar(ans,(cnt+1),stopper);
            //呼出元に返す
            System.out.println(cnt +":返り - return res <"+res+">");
            return res;
        }
        //呼出元に返す
        System.out.println(cnt +":返り - return ans <"+ans+">");
        return ans;
    }
}
