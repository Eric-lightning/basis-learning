# コマンドについて知る

```
$ bc -h

usage: bc [options] [file ...]
  -h  --help         print this usage and exit
  -i  --interactive  force interactive mode
  -l  --mathlib      use the predefined math routines
  -q  --quiet        don't print initial banner
  -s  --standard     non-standard bc constructs are errors
  -w  --warn         warn about non-standard bc constructs
  -v  --version      print version information and exit
```

- usage = 書式，という意味．
- `-`や`--`で始まるものは，大抵，オプションである．
- 大抵，`-`で始まるものは短いオプションである．
- 大抵，`--`で始まるものは長いオプションである．（`-`で始まるタイプもある）
- サブコマンドを持つものがある．（e.g. `apt update -y`）
- 順番が大事な場合と大事でない場合がある．書式に合わせるとよい．

大抵は以下のようになる．

| 短い書式 | 長い書式 | 意味 |
|:--------:|:--------:|:----:|
| `-h` | `--help` or `--human-readable` | ヘルプ文か人間 か 読みやすい形式
| `-v` | `--verbose` or `--version` | 冗長な出力　か　バージョン表示
| `-l` | `--long` | 長いよ
| `-s` | `--short` | 短いよ
| `-q` | `--quiet` | 静かに
| `-o` | `--output` | 出力を...（もしくは `-w`(`--write`)
| `-n` | `--number` | 行番号とか
| `-c` | `--char` | Character. 文字について
| `-i` | `--interactive` | 対話的
| `-y` | `--yes` | YES MAN

## マニュアル

MANualを見れる．

```
$ man ls
```

`q`（=quit）で閉じることができる．

#### 一行マニュアル

```
whatis ls
```

### 何処？

- 何処にある？
- どんな？
- マニュアルはどこ？


```
$ which bc
/usr/bin/bc
$ type bc
bc is /usr/bin/bc
$ whereis bc
bc: /usr/bin/bc /usr/share/man/man1/bc.1.gz /usr/share/info/bc.info.gz
```
