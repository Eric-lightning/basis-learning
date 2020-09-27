import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class IOeTryTest2{
    public static void main(String[] args) throws IOException {
        String fname = args[0];
        FileReader freader;
        BufferedReader buf;
        try{
            System.out.println("TRY");
            freader = new FileReader(fname);
            buf = new BufferedReader(freader);
            while(buf.ready()){
                System.out.println(buf.readLine());
            }
        }catch(IOException e){
            // Exception(例外処理）クラスのeを持つ。
            // Standard Output
            System.out.println("CATCH");
            // Standard Error Output
            System.err.println("error occured.");
            throw e;
        }finally{
            System.out.println("FINALLY");
        }
        System.out.println("FINALLYあと");

    }
}
