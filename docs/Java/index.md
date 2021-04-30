# Javaスコーラ

- このサイトは東京情報大学Javaスコーラのサポートページです。(2020-)
- Javaスコーラの資料をおいていきます。

## 全体的な学びの流れ

【説明】ガイダンス

1. 【初歩】Javaで学ぶ基本的考え方に則ったプログラミング
2. 【初歩】Javaで学ぶ関数型（メソッド）プログラミング
3. 【基礎】Javaで学ぶオブジェクト指向型（クラス）プログラミング
4. 【応用】Javaにおける外部パッケージの利用と並列（スレッド）処理
5. 設計とコーディング

EX. Java以外の言語も学んどけ。

## GATEWAY接続用ソフトウェア

- [VPN: Global Protect](https://ssl.edu.tuis.ac.jp/)
- SSH(お好きなソフトウェアをどうぞ）
  - 日本製の大学指定PCにインストール済み [Teraterm](https://ja.osdn.net/projects/ttssh2/releases/)
  - 日本製の高機能分割端末エミュレータ [RLogin](http://nanno.dip.jp/softlib/man/rlogin/)
  - RDPなどの設定も出来る [Bitvise SSH Client](https://www.bitvise.com/ssh-client-download)
  - 有名な海外のやつ [Putty](https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html)
  - Windowsのタイルアプリ [Fluent Terminal (Windows 10 App)](https://www.microsoft.com/store/productId/9P2KRLMFXF9T)
  - Microsoft純正 [Windows Terminal(Windows Terminal)](https://www.microsoft.com/store/productId/9N0DX20HK701)

## 参考資料
- [技術ブログQiitaのJava](https://qiita.com/tags/java)
- [質問サイトTeratailのJava](https://teratail.com/search?q=%5BJava%5D)
- [JavaDriveさん](https://www.javadrive.jp/start/)
- [yf8k-kbys氏](https://www.asahi-net.or.jp/~yf8k-kbys/newjava0.html)
- [TechScore.com](https://www.techscore.com/tech/Java/JavaIntro/index/)
- [IT専科さん](http://www.itsenka.com/contents/development/java/)
- [ぐぐればでてきます](https://www.google.co.jp/search?q=Java+%E5%85%A5%E9%96%80)

## スコーラ資料（授業の日程と比例しません！）

- [ガイダンス](00/GUIDE.md)

### 00.【説明】初回

- [00-01 : 情報領域](00/01.md)
- [00-02 : プログラム構造の基本的な考え方](00/02.md)
- [00-03 : プログラミング言語と環境構築](00/03.md)
- 00-EX : 本学におけるJavaの立ち位置

### 01. 【初歩】Javaで学ぶ基本的考え方に則ったプログラミング

- [01-01 : データ型](01/01.md)
- [01-02 : 演算子と式](01/02.md)
- [01-03 : 条件分岐](01/03.md)
- [01-04 : ループ文](01/04.md)
- [01-05 : 文字列（参照型）](01/05.md)
- [01-06 : 配列（一次元配列・二次元配列）（参照型）](01/06.md)
- [01-07 : パッケージ利用(BufferedReaderほか)](01/07.md)
- [01-08 : 引数の利用（mainのargs) ](01/08.md)
- [01-09 : 例外処理 `throws`,`throw`,`try`-`catch-finally`](01/09.md)
- [01-10 : `Collection` , `Set` , `Map` , `List` ](01/10.md)
- [01-11 : 入出力系総まとめ](01/11.md)
- [01-12 : 極めて実践的な演習みたいなもの](01/12.md)
- [01-13 : 成熟テスト](01/13.md)
- 01-EX : プログラマーに求められるもの

### 02. 【初歩】Javaで学ぶ関数型（メソッド）プログラミング

- [02-01 : 関数プログラミングとJavaにおけるメソッド](02/01.md)
- [02-02 : STATICメソッドプログラミングと再起処理、オーバーロードについて](02/02.md)
- [02-03 : INSTANCEメソッドプログラミング（自クラス呼出し）, `this`, 変数スコープ](02/03.md)
- [02-04 : 修飾子](02/04.md)
- 02-EX: EDITOR・Syntax Checker・Formatterのすすめ


### 03. 【基礎】Javaで学ぶオブジェクト指向型（クラス）プログラミング

- [03-01: クラスプログラミング](03/01.md)
- [03-02: 他クラスを継承したサブクラスの利用、オーバーライド、継承元（スーパークラス）のコンストラクタ呼出](03/02.md)
- [03-02.5: カプセル化という概念](03/02.5.md)
- 03-03: 抽象クラスとポリモーフィズム
- 03-04: インターフェースと実装
- [03-05: GUI](03/05.md)
- 03-EX: バージョン管理のすすめ

### 04. 【応用】Javaにおける外部パッケージの利用と並列（スレッド）処理

- 04-01 : 外部パッケージとクラスパス
- 04-02 : スレッド処理のイメージ
- 04-03 : スレッド処理の実装方法

### 05. 設計とコーディング

- 05-01 : 設計・ロードマップ・スモールスタートとアップデート
- 05-02 : コーディングとコメントアウト（DoxygenとJavaDocs）
- 05-03 : プラットフォーム（モバイル、Web、CLI、GUI）

### EX. Java以外の言語も学んどけ。

> ※ 時間が許す限り

- EX-01 : 学ぶ理由
- EX-02 : ポインタ - C/C++/Rust/Go(C#?)
- EX-03 : スクリプト - Python3/Bash
- EX-04 : Web - NodeJS, React, Vue
- EX-05 : Assembly（セキュリティとして）
- EX-EX : 大学で出来ること  
