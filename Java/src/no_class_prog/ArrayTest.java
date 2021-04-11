import java.util.Arrays;
public class ArrayTest{
    public static void main(String[] args){
        // 宣言
        String scola_name[] =  {"Java","Linux","Network","C","AI"};

        // 宣言
        String[] kamoku = new String[5]; // ここで、「５」は要素の数
        // 代入
        kamoku[0]="国語";
        kamoku[1]="数学";
        kamoku[2]="英語";
        kamoku[3]="社会";
        kamoku[4]="理科";

        //配列の大きさを確認するメンバ変数 ARRAY.length
        int kamoku_nagasa = kamoku.length;
        System.out.println("Len -> "+ kamoku_nagasa);

        // 出力
        for(int i=0;i < kamoku_nagasa; i++)
            System.out.println("kamoku["+i+"] ->" + kamoku[i]);

        //　拡張forというやり方 添え字はない。
        for(String i : scola_name)
            System.out.println(i);

        // 無理やりLAMDAスタイル
        // java.utils.Arrays.asListでList型 -> forEachでグルグル。
        Arrays.asList(kamoku).forEach(System.out::println);

    }

}
