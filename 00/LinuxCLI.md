
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
CSV_kaiseki  Mesg_Files  SBC     api         bash-scripts  ccn210  go                 javaScola  node_modules  pandoc-2.10.1-1-amd64.deb  ripgrep_12.1.1_amd64.deb  star.md     test             web_notetools
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
- `more [filename]` ... 上から順に見る
- `less [filename]` ... スクロールしながら見る

## ファイルを検索する

- `find ./ -name [filename]` ... `./`以下のなかで、filenameのファイルがどこにあるか探す（その他、オプションによって、何分以内に更新したファイルなども確認でき
- `grep keyword  [filename]` ... keywordが何行目にあるか全文検索する。大学のサーバーではなく、自分の環境でなら、[BurntSushi/ripgrep](https://github.com/BurntSushi/ripgrep)もおすすめ。

## その他

 大量にコマンドあります。
 ```
 # 参考: 僕が使っているコマンド（一部）

at
brew
cargo
cat
bat
cd
chmod
composer
cp
crontab
curl
date
diff
disown
dig
dstask
exit
find
git
head
htop
iconv
ip
java
javac
jobs
less
ln
locale
ls
lsblk
mdless
mkdir
mv
nmap
nslookup
node
nohup
note
npm
pandoc
ping
pwd
rg
rm
rmdir
scp
ssh
ssh-copy-id
sudo
tail
tar
touch
tree
tty-table
uname
unzip
vi
w
watch
wget
which
who
zsh
```
