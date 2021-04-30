Title: 大学サーバーにリモート接続する
Date: 2021-04-29
Category: Linux
Tags: SSH, Teraterm, RLogin
Summary: SSHで大学に接続

ここでは，大学サーバにリモート接続する方法を紹介します．
手元にLinux環境がなくても，ネットワーク越しにLinuxを操作できます．

1. 大学外からアクセスするため，VPN接続を行う．

- [参考資料（学内からのみアクセス）](http://www.edu.tuis.ac.jp/~g21008ny/data/lan/TUIS-VPN_2019.pdf)

2. Teratermなどがインストールされていない場合はインストールする．

例:
- [Teraterm](https://ja.osdn.net/projects/ttssh2/releases/)
- [RLogin](http://nanno.dip.jp/softlib/man/rlogin/#INSTALL)
- [Bitvise](https://www.bitvise.com/download-area)
- WSL上でSSHコマンドを実行する

3. 大学ネットもしくはVPN接続の上で，それらのソフトを用いて接続します．

| 接続情報| ----- |
|:-------:|:-----:|
|ホスト| `gateway.edu.tuis.ac.jp` |
|ポート| [Well-Known（SSH）](https://ja.wikipedia.org/wiki/TCP%E3%82%84UDP%E3%81%AB%E3%81%8A%E3%81%91%E3%82%8B%E3%83%9D%E3%83%BC%E3%83%88%E7%95%AA%E5%8F%B7%E3%81%AE%E4%B8%80%E8%A6%A7)|
|ユーザ| EARTH情報教育システムのユーザ
|パスワード| EARTH情報教育システムのパスワード



