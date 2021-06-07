/*
* TuisStudentのテスト用クラス
*/

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TuisTester {
  // 入力用メソッド
  static String input(String text) throws IOException{
    System.out.print(text + ": ");
    return (new BufferedReader(new InputStreamReader(System.in))).readLine();
  }
  // メイン
  public static void main(String[] args) throws IOException{
    // TuisStudent型のリストを作成する
    List<TuisStudent> studentList = new ArrayList<TuisStudent>();
    // Studentもとい、TuisStudentに大学名をセットする
    TuisStudent.setUnivName("東京情報大学");
    // 入力
    while(true){
      String id       = input("学籍番号");
      String name     = input("名前");
      String earthId  = input("EARTH_ID");
      String gradName = input("学部名");
      String deptName = input("学科名");
      String seriesName = input("学系名");
      int admissionYear = Integer.parseInt(input("入学年（西暦）"));

      String chk = input("追加しますか?[y/n]");
      if(chk.equals("y")){
        studentList.add(new TuisStudent(id,name,earthId,gradName,deptName,seriesName,admissionYear));
      }

      chk = input("続けますか?[y/n]");
      if(chk.equals("n")) break;
    }
    System.out.println("=========================================================");
    printCSV(studentList,true);
  }

/*
* CSVを標準出力（ArrayList<TuisStudent>,boolean ヘッダを付与するか）
*
* TODO:ファイルに追記に変更
*
*/

  static void printCSV(List<TuisStudent> list,boolean header){
    String sep = ",";
    if(header) System.out.println("ID,NAME,EARTH_ID,IS_EARTH_ID,UNIV_NAME,GRAD_NAME,DEPT_NAME,SERIES_NAME,ADMISSION_YEAR");
    for(TuisStudent stu : list){ // 拡張For文
      String line = stu.getId()
        + sep + stu.getName()
        + sep + stu.getEarthId()
        + sep + TuisStudent.isEarthId(stu.getEarthId())
        + sep + Student.getUnivName()
        + sep + stu.getGradName()
        + sep + stu.getDeptName()
        + sep + stu.getSeriesName()
        + sep + stu.getAdmissionYear();
      System.out.println(line);
    }
  }
}
