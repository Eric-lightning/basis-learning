Title: Linuxスコーラ資料
Date: 2021-04-29
Category: Linux
Tags: WSL SSH
Slug: foo
Authors: Yuto Nakagawa
Summary: Linuxの導入

## 初回

- Linuxについて知る．


- VirtualBox上で起動する（スコーラでは紹介のみ）
- [大学のサーバーにリモート接続する](001_CONNECT_SSH_TO_GATEWAY.md)
- [WSLの導入方法](001_HOW_TO_INSTALL_WSL.md)

## 基礎を知る


- [コマンドについて知る](COMMAND.md)
- [ディレクトリ構造を知る](DIRECTORY.md)

- [ユーザーやグループについて知る](USER_AND_GROUP.md)
- テキストの出力（echo,printf,seq,date,whoami,pwd)
- [ファイルの処理01: 作成・削除・移動・名前の変更・ファイルへの権限](FILE_BASIS.md)
- テキストの中身（ASCII,UTF-8,バイト数）[課題](kadai/TextEncoding.md)
- 文字コード変換(`nkf`,`iconv`)
- テキストの処理01: テキストストリーム（標準入出力とパイプ）とテキスト処理の基本的コマンド
- インターネット01: ダウンロードとブラウジング（wget,curl,aria2,w3m,lynx,firefox,selenium)
- インターネット02: cURLからAPIを使ってみる（DiscordのWebhook）
- バージョン管理01: git clone(discord.sh)


## 参考資料

Linux入門参考サイト

- [エンジニアの入り口](https://eng-entrance.com/category/linux)
- [Wikibook](https://ja.wikibooks.org/wiki/UNIX/Linux%E5%85%A5%E9%96%80)
- [とほほ](http://www.tohoho-web.com/wwwunix.htm)
- [京都大学 Linuxマニュアル](https://web.kudpc.kyoto-u.ac.jp/manual/ja/linux)
- [逆引きLinux](https://linux.just4fun.biz/?%E9%80%86%E5%BC%95%E3%81%8DUNIX%E3%82%B3%E3%83%9E%E3%83%B3%E3%83%89)
- [kazmax - Linuxで自宅サーバ](https://kazmax.zpp.jp/)
- [Server World](https://www.server-world.info/query?os=Ubuntu_18.04)

## TODO

- [テキストの処理02: 置換等，言語的・正規表現的な処理（`grep`,`sed`,`awk`）](REGEX.md)
- テキストの処理03: エディタ(vim,emacs,nano,`$EDITOR`)
- ファイルの処理02: 整合性(`sha1sum`)と差分(`diff -up`)，
- プロセスの管理01: プロセスの基礎（親子）
- プロセスの管理02: コマンドライン上での管理(fg,bg,disown,nohups)
- プロセスの管理03: 全体の管理と終了コード


- ユーティリティ01: 解凍と圧縮とその形式
- [ユーティリティ02: 検索2（find,locate）](SEARCH.md)

- インストール01: パッケージ管理を用いたインストール（`x11-apps`を例に）
- インストール02: ビルド済みパッケージのインストール（`ripgrep`,）

- インストール03: ソースコードを用いたインストール（`emiclock`を例に）
- インストール04: ソースコードを用いたインストール（応用）（`ns2`を例に）


- SSH01: `ssh`と`rsync`と非推奨な`scp`, SOCK5（大学内)
- SSH02: `ssh-copy-id`と公開鍵認証（大学内）
- VPN01: IPSec XAuth PSK と `vpnc`
- SRV01: Google Cloud Platform と Amazon Web Serviceの無料枠



- Xmingの導入と仕組み
- apache2の導入と`/etc/init.d/`の構造，`systemd`の話．
- wiresharkの導入とtcpdump













## メモ

- 基本的コマンドについて知る．
 - ユーザーの基本的概念（Root, Groups)
 - 権限の基本的概念（User,Group,Other,Read,Write,Execute）
 - [CoreUtils](https://ja.wikipedia.org/wiki/GNU_Core_Utilities)よりピックアップ
 - まずは，`whatis`を利用してみる．

- FileUtils
  - ls, touch, rm, mkdir, rmdir, cp, mv
  - ln, readlink
  - chmod, chown, chgrp
- TextUtils
  - cat, tac, paste, join
  - cksum(sha256sum,sha1sum,md5)
  - head,tail
  - nl, wc
  - sort, uniq
  - diff, comm
- ShellUtils
  - basename,dirname
  - pwd, type, which, whatis
  - users, who, last
  - seq, printf
  - du, df
  - date


- ssh,scp(dup),rsync,sftp



- ファイル入出力を体感する
  - echo,cat,標準出力,標準入力,標準エラー出力
  - tr, sed, 正規表現入門


- 変数に関する理解
  - declare
  - exportと環境変数
  - array


- 配列

