public class Hurley {
    // クラス定数
    final static String model = "XL883H";

    // クラス変数
    static int num_of_units;
    // インスタンス変数
    int speed;
    boolean light = false;

    // コンストラクタ
    Hurley(){
        num_of_units++;
    }
    //コンストラクタ（初期化時にスピード調整）
    Hurley(int speed_src){
        num_of_units++;
        this.speed = speed_src;
    }

    // インスタンスメソッド
    //----------------------------------------
    // スピード調整
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        // ローカル変数のない場合は this がなくても動作する
        // But...?
        return this.speed;
    }
    //----------------------------------------
    // ライトの切り替え
    public void setLight(boolean light){
        this.light = light;
    }
    public boolean getLight(){
        return this.light;
    }
    //========================================
    // クラスメソッド
    //----------------------------------------
    // Hurleyの台数
    public static int getUnits(){
        return num_of_units;
    }
    public static String getModel(){
        return model;
    }
}
