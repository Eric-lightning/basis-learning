/*
* 本学用の学生クラス（学生クラスを継承）
*
* 学系名とEARTHのIDを追記
*
*/
import java.util.regex.Pattern; //正規表現のパターン
import java.util.regex.Matcher; //正規表現のマッチ

/*
* extends [継承元] で、継承する
* - 継承元を「スーパークラス」
* - 継承先を「サブクラス」と呼ぶ。
*/

class TuisStudent extends Student{
  String seriesName; //学系名
  String earthId;    //EARTH_ID
/*
* 大学IDの正規表現パターン
* - 特定パターンの文字列抽出には、「正規表現（Regex）」を用いる。
* - Javaでは、`java.util.regex.*`を用いる。Linuxでは、VimコマンドやSedなどを利用する
* - 以下は、定数として、final変数
*/
  final static String earthId_pattern = "([j|k]20|[j|k]19|[j|k]18|[j|k]17|j16|j15|j14|j13)[0-9][0-9][0-9][a-z][a-z]";
// コンストラクタ
  TuisStudent(String id, String name, String earthId, String gradName, String deptName, String seriesName, int admissionYear){
    super(id, name, gradName, deptName, admissionYear); // super() は、スーパークラスのコンストラクタを呼び出す.
/*
* デフォルトでは、コンストラクタの引数がない場合は、サブクラスでコンストラクタを明示的に作成しなくても良い。これは、以下のようなものが暗黙的に作成されるため。
* // サブクラスのコンストラクタ
* SubClass(){
*   super();
* }
* 引数が必要な場合はsuperを明示的に呼び出すことが必要、
*
*/
    this.seriesName = seriesName;
    this.earthId    = earthId;
  }
  // ゲッター
  String getEarthId()    { return this.earthId; }
  String getSeriesName() { return this.seriesName; }

  // EarthIDかどうかを判断するUtility.
  static boolean isEarthId(String id){
    return Pattern.compile(earthId_pattern).matcher(id).matches();
  }
}
