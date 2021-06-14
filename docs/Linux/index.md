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


## TODO


- テキストの処理01: テキストストリーム（標準入出力とパイプ）とテキスト処理の基本的コマンド
- テキストの処理02: 言語的・正規表現的な処理（grep,sed,awk）
- テキストの処理03: エディタ
- ファイルの処理02: 整合性と差分，文字コード変換

- プロセスの管理01: プロセスの基礎（親子）
- プロセスの管理02: コマンドライン上での管理(fg,bg,disown,nohups)
- プロセスの管理03: 全体の管理と終了コード

- インターネット01: ダウンロードとブラウジング（wget,curl,aria2,w3m,lynx,firefox,selenium)
- インターネット02: cURLからAPIを使ってみる（DiscordのWebhook）
- ユーティリティ01: 解凍と圧縮とその形式
- ユーティリティ02: 検索2（find,locate）

- インストール01: パッケージ管理を用いたインストール（x11-appsを例に）
- インストール02: ビルド済みパッケージのインストール（実演のみ）
- バージョン管理01: git clone
- インストール03: ソースコードを用いたインストール（emiclockを例に）
- インストール04: ソースコードを用いたインストール（応用）（ns2を例に）


- SSH01: sshとrsyncと非推奨なscp, SOCK5（大学内)
- SSH02: sh-copy-idと公開鍵認証（大学内）
- VPN01: IPSec XAuth PSK と VPNC
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

