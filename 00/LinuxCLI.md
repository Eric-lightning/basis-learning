
# Linuxの弄り方

- コマンド文を与えると、実行します。コマンドは、行頭に書きます。
- `-a`や`-l`は、短いオプションです。
- `--all`や`--list`は長いオプションです。

```
$ [コマンド] [オプション] [ファイル名やディレクトリ（フォルダ）名]
```

## 主要コマンド

### lsコマンド - LISTする

```
eric@DESKTOP-6GK3A2H:~$ ls
99_MOVE      LaTeX       NTLRTC  TeXWorkDir  apo           ccn204  chat-group-master  janog46    myCoreutils   package-lock.json          pyselen                   some-lists  tango_directory  utils
```

### cdコマンド - Change Directory(フォルダ) する

```
eric@DESKTOP-6GK3A2H:~$ cd javaScola/
eric@DESKTOP-6GK3A2H:~/javaScola$ ls
00  01  02  03  Editor.md  How2Coding.md  README.md  assets  index.md  src
```

#### 上の階に行く場合は、 `..` とする

```
eric@DESKTOP-6GK3A2H:~/javaScola$ cd ..
```

#### Linuxにおけるディレクトリ（フォルダ）階層

- 一番上を`/`と書き、Root（ルート、根っこ）と呼ぶ。
- `/`で下の階層に行く。

| PATH | 意味 |
`/` | ルート
`/home/j1xxxxaa` | ホームディレクトリ
`/home/j1xxxxaa/java` | ホームディレクトリ中の`java`フォルダ


### 今いる場所を見る pwd

```
eric@DESKTOP-6GK3A2H:~$ pwd
/home/eric
eric@DESKTOP-6GK3A2H:~$ cd javaScola/
eric@DESKTOP-6GK3A2H:~/javaScola$ pwd
/home/eric/javaScola
```

### mkdir - Make Directoryする

```
eric@DESKTOP-6GK3A2H:~/javaScola$ mkdir workspace
eric@DESKTOP-6GK3A2H:~/javaScola$ ls
00  01  02  03  Editor.md  How2Coding.md  README.md  assets  index.md  src  workspace
eric@DESKTOP-6GK3A2H:~/javaScola$ cd workspace/
eric@DESKTOP-6GK3A2H:~/javaScola/workspace$ pwd
/home/eric/javaScola/workspace
```

## ファイルを見る

- `cat  [filename]` ... 全部見る
- `more [filename]` ... 上から順に見る. スペースで「次へ」
- `less [filename]` ... スクロールしながら見る。`q`で終了.

## ファイルを検索する

- `find ./ -name [filename]` ... `./`以下のなかで、filenameのファイルがどこにあるか探す（その他、オプションによって、何分以内に更新したファイルなども確認でき
- `grep keyword  [filename]` ... keywordが何行目にあるか全文検索する。大学のサーバーではなく、自分の環境でなら、[BurntSushi/ripgrep](https://github.com/BurntSushi/ripgrep)もおすすめ。


## ポイント

- `^C`の`^`はCtrlという意味です。`^C`でキャンセルです。`^Z`で休止状態です。`^Z`した場合は、`jobs`コマンドで番号を確認、`fg %1`で復帰できます。
- `less`などのコマンドは、quitを意味する`q`で終了することもできます。


## その他

 大量にコマンドあります。 `#`以降は、説明です.
 ```
# 参考: 僕が使っているコマンド（一部）


at # 指定時間にコマンド実行
brew # linuxbrew
cargo # Rustパッケージマネージャー
cat
bat # catの代替コマンド
cd 
chmod # 権限（読み、書き、実行など）の変更
composer # PHPのパッケージマネージャー
cp
crontab # 指定した月日曜時分にコマンド実行（繰り返し）
curl # HTTPゲット
date # 日時のセットとゲット
diff # ファイル同士の差分
disown # 端末を閉じても実行を続ける
dig # DNSのﾁｪｯｸ
dstask # タスク管理
exit # 終了
find
git # バージョン管理システム
head # ファイル先頭から見る
htop # システム情報を見る
iconv # ファイル文字コード変換
ip # ネットワーク情報の表示
java # Java実行
javac # Javaコンパイル
jobs # 端末で動いているプロセスの確認
less
ln # シンボリックリンク（ショートカット）を張るなど
locale # ファイル名を探す
ls
lsblk # ブロックデバイスを見る
mdless # Markdownファイルを見る
mkdir # ディレクトリを作成する
mv # 名前の変更・移動
nmap # ポートスキャン
nslookup # DNS A レコード解決
node # nodeJS実行
nohup # 端末を閉じても実行
note # 独自コマンド
npm # NodeJSパッケージマネージャー
pandoc # 文書変換(Word,Markdown,TeXなど　)
ping # ネットワーク死活監視
pwd # フルパスで表示
rg # repgrep
rm # 削除
rmdir # 空のディレクトリを削除
scp # Secure Copy (SSHでファイル転送)
ssh # Secure Shell（リモートコマンドライン接続）
ssh-copy-id（SSHで公開鍵転送）
sudo（特権・ルート権限の実行）
tail（ファイル末尾）
tar（ファイルをアーカイブ化）
touch（ファイル生成、最終変更日時変更）
tree（Treeでリスト）
tty-table（CSVをリッチに表示）
uname（システム情報表示）
unzip（ZIP解凍）
vi（エディター）
w（現在ログイン中のユーザー）
watch（X秒毎にコマンドを実行し確認する）
wget（HTTPダウンロード）
which（コマンドの置いてある場所）
who（現在ログインのユーザー）
zsh（シェル）
```
