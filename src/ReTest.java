public class ReTest{
    public static void main(String[] args){
        int res = bar(1,1,10000);
        System.out.println("END - res = "+ res);
    }
    static int bar(int src,int cnt,int stopper){
        int ans = src * 2;
        System.out.println("2^" + cnt + " = " + ans);
        if (ans <= stopper){
            return bar(ans,++cnt,stopper);
        }
        return ans;
    }
}
