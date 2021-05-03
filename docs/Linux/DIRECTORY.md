# ディレクトリ構造と基本的コマンド

## Linuxのディレクトリ構造

- コマンド理解
  - `whatis ls`
  - `whatis pwd`
  - `whatis cd` ... Change Directory（ディレクトリの変更）

#### Folder? Directory?

- フォルダは，GUIで表示する際のアイコンの書類挟み（＝フォルダ）のことを指す．
- ディレクトリは，CLI(CUI)/GUIでも指す．≒ フォルダ


##### CUI? CLI?

- CUI ... Character User Interface 専ら日本でのみ通用する言い回し．
- CLI ... Command Line Interface 英語圏の言い回し．国際的．


<script id="asciicast-411251" src="https://asciinema.org/a/411251.js" async></script>


```
$ tree -L 1 /

/
├── bin   # BINary - コマンドなどの実行可能ファイルが入っている．
├── boot  # 起動関連のファイルが入ってる．/boot/grub /boot/efi など
├── dev   # DEVice デバイスファイルが入っている． /dev/sda /dev/cdrom
├── etc   # ET Cetera. 設定ファイルなど様々なファイルが入っている．
├── home  # home dir. ホームディレクトリが入る
├── lib   # ライブラリ
├── lib64 # 64bitのライブラリ
├── media # ほかのHDDなどが入っている．
├── mnt   # マウントされたディスクのディレクトリなどが入っている．
├── opt   #
├── proc  # 各種情報が入っている．CPU/Memoryほか．
├── root  # root（管理者）のホームディレクトリ
├── run   # 動いているプロセスが入っている．
├── sbin  # Su-BINary ... 管理者が利用する実行可能ファイルが入っている．
├── snap  # SNAPパッケージ
├── srv   # SeRVer関係
├── sys   # SYStemコアなシステム関連のファイル. /sys/procなど．
├── tmp   # TeMPorary 一時的ファイル．
├── usr   # USeR - ユーザーが利用する． /usr/local/bin
└── var   # VARiable - 必要なテキスト系のファイル（/var/www /var/log /var/spool/mail など）

20 directories, 1 file
```
