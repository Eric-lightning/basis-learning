# コーディングの仕方

## コーディング規則

プログラミングする上で，理解しやすい，わかりやすいコードを書くことが求められます．その他にも変数の命名規則（名前の付け方）などの指定があります．

これはわかりやすくするだけでなく，予約語（言語にもともと用意されているもの）と被ったりしないようにする意味もあります．

参考: [Javaコーディング規約 | Future Enterprise Coding Standards](https://future-architect.github.io/coding-standards/documents/forJava/Javaコーディング規約.html)

## ブロック構造

Javaでは `{}`や`()`といった括弧を用いてブロックに分ける構造になっています．

これはC言語なども同様です．作法は様々あります．

```java
class Sahou {
    public static void main(String[] args){
        // Javaではこのように書かれることが多いです
    }

    public static void sub()
    {
        // C言語だとこういう作法があります．
    }

}
```

また，字下げ（インデント）も様々あります．上記では1TAB = 半角空白4文字ですが，コレが2文字だったりする場合があります．

## コメントアウト

コメントアウトは出来るだけ積極的に書くべきです．

```java
/* 
複数行の
コメントアウトは
こんなかんじ
*/

// 一行ならこんな感じ   
```

書き方は

- 本人があとから読み返して明確に理解できること

- 他者がコードを読んで，どのような構造になっているか理解できること

が大切です．

特に，バグ(issue)修正や機能更新など，あとでコーディングに修正を掛ける際の手助けにもなります．例えば，機能拡張を視野に入れてコーディングする際に該当箇所にTODOをコメントアウトすることなどがあります．

```java
/* 時間割を通知するメソッド
 * TODO:
 * - 機能改善: 時間割の詳細も送信できるようにする
 * - 既知のバグ: 通知サーバーに送れなかったときに再試行されない
 */

void sendTTNotify(TimeTable jikanwari){
```

例として，下記は私が授業で書いたものです．

```java
/*
人工知能プログラミング: TRANSLATION - 統計型翻訳
@author J17273 中川 佑人
書式: 
 $ java translation > Anser.csv 2> Table.csv
 $ column -ts, Anser.csv #questionから想定される訳
 $ column -ts, Table.csv #確率表の表示
*/

import java.util.*;

public class translation{
    public static void main(String[] args){
        String[][] w = new String[2][5];
        // 学習用対訳集
        w[0][0] = "This is a pen";
        w[1][0] = "これ/は/ペン/です";
        w[0][1] = "I have a pen";
        w[1][1] = "私/は/ペン/を/持っている";
        w[0][2] = "The apple is ripe";
        w[1][2] = "この/リンゴ/は/熟れている";
        w[0][3] = "I eat an apple";
        w[1][3] = "私/は/リンゴ/を/食べる";
        w[0][4] = "I have a pineapple";
        w[1][4] = "私/は/パイナップル/を/持っている";
        //問題用英文
        String question = "I have an apple";

        // 1. 英語: 全単語リストとユニークな単語リストの作成
        List<String> EN_ALL_WORDs = new ArrayList<>();
        List<String> EN_LS_UNIQ = new ArrayList<>();
        for (String en_line : w[0]) {               //対訳集英語行を取得。
            String[] en_words = en_line.split(" "); //単語に切り分ける。
            for(String en_word : en_words){         //切り分けた単語をFORする。
                EN_ALL_WORDs.add(en_word);          //条件なく全単語を追加する。
                boolean chk = true;                 //ユニーク単語リストを探索し同じものがあった場合、偽を返す。真の場合、追加する。
                for(String chkuniq : EN_LS_UNIQ) if(chkuniq.equals(en_word)) chk = false;
                if(chk) EN_LS_UNIQ.add(en_word);

            }
            EN_ALL_WORDs.add("!SEP!");
        }

        //2. 英語: 全単語リストとユニークな単語リストの作成
        List<String> JP_ALL_WORDs = new ArrayList<>();
        List<String> JP_LS_UNIQ = new ArrayList<>();
        for (String jp_line : w[1]) {               //対訳集日本語行を取得。
            String[] jp_words = jp_line.split("/"); //単語に切り分ける。日本語はスラッシュで分ける。
            for(String jp_word : jp_words ){        //切り分けた単語をFORする。
                JP_ALL_WORDs.add(jp_word);          //条件なく全単語を追加する。
                boolean chk = true;                 //ユニーク単語リストを探索し同じものがあった場合、偽を返す。真の場合、追加する。
                for(String chkuniq : JP_LS_UNIQ) if(chkuniq.equals(jp_word)) chk = false;
                if(chk) JP_LS_UNIQ.add(jp_word);
        }
```

どこでどのような処理を行っているかわかるようにしてください．

## snippet（スニペット）

スニペットとは「切れ端」という意味です．

本格的にプログラミングを開始する際に，最初から最後まで毎回コーディングするのは大変な労力がかかります．

そこで，よく使う短いコードを保存し再利用することが行われます．

これらを**コードスニペット**といいます．

入門の際は，ひたすらコーディングする練習になるのでスニペットは不要です．

慣れてきたら自身のスニペットを作ってみると良いでしょう．
