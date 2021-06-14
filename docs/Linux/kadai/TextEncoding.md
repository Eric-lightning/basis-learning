# 課題

[東京大学 2016年度 情報](https://lecture.ecc.u-tokyo.ac.jp/~c-ymatsu/joho2016/) より一部改変

## 文字コードについて

1. `echo`とリダイレクト（`>`,`>>`）を用いて、中身が英数字のみ、日本語を含んだファイルを作りなさい。
2. `nkf`もしくは`iconv`コマンドを用いて、Shift-JIS文字コードに変換したファイルを作成しなさい。
3. 1および2のファイルについて、以下を参考に10進数、16進数表記のコードを確認しなさい。

```bash
# 文字
hexdump -c file.txt
# 10進数
hexdump -d file.txt
# 16進数
hexdump -x file.txt
```

4. 下記を参考に、改行あり、改行なし、全角空白、半角空白、バックスラッシュなどの文字コードを確認しなさい。また`xxd`の`-r`オプションを用いて逆も確認しなさい。

```bash
echo "break" | hexdump -C
echo -n "nobreak" | hexdump -C

echo "　" | xxd -p
echo 0a0a0a | xxd -r -p
```


