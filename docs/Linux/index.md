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


## 第1回以降

- 基本的コマンドについて知る．
 - コマンドの形式
 - ディレクトリ構造（/,/home,/etc,/boot,/var,/bin,/usr/local,/root,/tmp)
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

