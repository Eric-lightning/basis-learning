# 置換・正規表現

## ソート・ユニーク, csvテクニック

- Tranco.list: [https://tranco-list.eu/](https://tranco-list.eu/)

- `head`,`tail`,`tail -n +100`
- `sort`
- `column`
- `uniq`
- `cut`
- `shuf`
- `sed`,`awk`
- `grep`

1. 特定の範囲を自由に取る．（TOP10件，末尾10件, 500-550位など）特定の行だけやる. `sed`,`awk`
2. ドメイン順にソートしてみる． (`sort -t, -k2`)
3. タブ区切りに見せる．(`column -ts,`)
4. TOP1000のうち，何で始まるものが多いか？(`cut`,`sort`,`uniq`)
5. ランダムに10ドメイン抽出する(`shuf`)
6. ランダム抽出したドメインを順位順にソートして見やすくする(`column`）
7. 自分の知りたいドメインを検索．(`google.com`.`github.com`,
8. `xn--`で始まるドメインがある．いくつあるか？

<!--

### 応用

 `xn--`は，PunyCodeと呼ばれる多言語ドメインである．
aptで`idn`パッケージをインストールし，`idn -u [文字列]`をすると，日本語等に変換される．

下記のように, `xargs -L 1 idn -u`で複数行の処理を逐次行うことが出来る．

```sh
cat domain.txt | xargs -L 1 idn -u
```

しかしながら，csvファイルの１カラム目があるとうまく変換できない．

```sh
$ cat puny-domain.csv | xargs -L1 idn -u | head -10
8448,xn--b1aew.xn--p1ai
11606,xn--42c9bsq2d4f7a2a.com
17336,xn--d1abkefqip0a2f.xn--p1ai
17833,xn--80aesfpebagmfblc0a.xn--p1ai
18734,xn--j1ahfl.xn--p1ai
19461,xn--90adear.xn--p1ai
24041,xn--pckua2a7gp15o89zb.com
29115,xn--80affa3aj0al.xn--80asehdb
29157,xn--80abucjiibhv9a.xn--p1ai
29718,xn--41a.ws

$ cat puny-domain.csv | cut -d, -f2 | xargs -L1 idn -u | head -10
мвд.xn--p1ai
ปั้มไลค์.com
единыйурок.xn--p1ai
стопкоронавирус.xn--p1ai
урок.xn--p1ai
гибдд.xn--p1ai
求人ボックス.com
телеграм.xn--80asehdb
минобрнауки.xn--p1ai
я.ws
```

しかし順位の情報がほしい．
そこで，`cut`を用いて１カラムと２カラム分割し，２カラム目だけ変換し，`paste`を用いて，再び順位付きのCSVにする方法を取ることにした．
この手法を実践せよ．

-->


## 置換

### tr

- `tr`コマンドはバイト単位で処理するため，基本使わないほうが良い． [参考](https://www.it-swarm-ja.com/ja/character-encoding/tr%E3%81%AF%E3%82%A2%E3%83%9D%E3%82%B9%E3%83%88%E3%83%AD%E3%83%95%E3%82%A3%E3%82%92%E7%BD%AE%E3%81%8D%E6%8F%9B%E3%81%88%E3%81%BE%E3%81%9B%E3%82%93/956771543/)
  -その特性を理解した上で用いる or マルチバイトに対応したtrコマンドを探す.
  - [UTF-8のマルチバイト文字](http://orange-factory.com/dnf/utf-8.html)

```sh
$ echo "あいうえお" | tr "あいうえお" "ABCDE"
EECEEEEEEEEEEEE
```

#### 実践

- ASCII（英数字のみ，１バイト文字）なら良い．
  - Romeo and Juliet: [https://www.gutenberg.org/files/1112/1112.txt](https://www.gutenberg.org/files/1112/1112.txt)

> 1112.txtではなくRomemo.txtとして保存したい，適宜オプションをつけよう．

```sh
cat Romeo.txt | tr ' ' '\n' # 空白を改行に変える
cat Romeo.txt | tr -s '\n' # sオプションで\nが２回続いたら一つにする．つまり？
cat Romeo.txt | tr -d '\n' # dオプションで\nを削除する
cat Romeo.txt | tr -d ",\".'" # , " . ' を削除する
```

> 単純に，" とすると，文字列として終了してしまう． \" とすることで逃がす（エスケープする）
> e.g. '\'', "\""


1. 頻出単語を探せ．ただし，`.`,`,`,`"`,`'`を消すこと．`?`,`!`などその他は残っても良い． 使用コマンドは，`cat`,`wc`, `sort`, `uniq`,`tr`である．コレ以外を使用しても良い．
2. 有名な一節として，下記がある．何行目にでてくるか．コマンドを用いてさがせ．

```txt
My only love, sprung from my only hate!
> 私の唯一の愛は、私の唯一の憎しみから飛び出した．
```

3. 作中で何回ジュリエットが呼ばれているか．出題者が確認したところ，ジュリエットは下記３つの表現で呼ばれていた．これらがいくつあるか把握せよ．

```
Jul.
Juliet
Juleq
```

## sed/awk/grep -E

access.logやerror.log, md-file,ccn-logを利用する予定
