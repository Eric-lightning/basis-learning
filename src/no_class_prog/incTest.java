public class incTest{
    public static void main(String[] args){
        int aa=0;
        int ba=0;
        int ca=0;
        System.out.println("----- 定義 -----");
        System.out.println("aa = "+aa);
        System.out.println("ba = "+ba);
        System.out.println("ca = "+ca);
        System.out.println("----- aaについて -----");
        aa++; // `a = a + 1;`相当
        System.out.println("後置されたaa = "+aa);
        ++aa; // `a = a + 1;`相当
        System.out.println("更に前置されたaa: = "+aa);

        int b = ba++; // `b = a; a = a + 1;`相当
        int c = ++ca; // `a = a + 1; b = a;`相当


        System.out.println("後置されたba = " + ba);
        System.out.println("前置されたca = " + ca);
        System.out.println("後置され代入されたb = " + b);
        System.out.println("前置され代入されたc = " + c);


        int x1=0;
        int x2=0;
        System.out.println("後置: x1 = " + (x1++));
        System.out.println("前置: x2 = " + (++x2));
        System.out.println("----- インクリメント済み -----");
        System.out.println("後置: x1 = " + x1);
        System.out.println("前置: x2 = " + x2);

    }
}
