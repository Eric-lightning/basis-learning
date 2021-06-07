import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOeTest_throw{
    public static void main(String[] args) throws IOException {
        String fname = args[0]; // 1.
        FileReader freader = new FileReader(fname); // 2.
        BufferedReader buf = new BufferedReader(freader); // 3.
        while(buf.ready()){
            System.out.println(buf.readLine()); //4.
        }
    }
}
