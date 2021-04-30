/*
* 継承元のStudent.java
*
* 大学名を静的に指定し、それ以外はインスタンス
*
*/


class Student {
  private        String id;       //学籍番号
  private        String name;     //氏名
  private static String univName; //大学名
  private        String gradName; //学部名
  private        String deptName; //学科名
  private        int    admissionYear; //入学年

  // 大学名のセット`
  static void setUnivName(String univ){
    univName = univ;
  }
  // 大学名のゲット
  static String getUnivName() {
    return univName;
  }
  // コンストラクタ
  Student(String id, String name, String gradName, String deptName, int admissionYear){
    this.id       = id;
    this.name     = name;
    this.gradName = gradName;
    this.deptName = deptName;
    this.admissionYear = admissionYear;
  }
  // ゲッター
  String getId()         { return this.id;       }
  String getName()       { return this.name;     }
  String getGradName()   { return this.gradName; }
  String getDeptName()   { return this.deptName; }
  int getAdmissionYear() { return this.admissionYear; }

}
