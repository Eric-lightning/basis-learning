import java.io.*;
import java.lang.StringBuffer;
//import java.util.Random;

public class PackageTest{
    public static void main(String[] args) throws IOException {
         java.util.Random r = new java.util.Random();
         System.out.println("- Int -----------------------------------");
         for(int i=1; i<10; i++)
            System.out.println(r.nextInt()+" ");
         System.out.println();
         System.out.println("- Double -----------------------------------");
         for(int i=1; i<10; i++)
            System.out.println(r.nextDouble()+" ");
         System.out.println();

         System.out.println("Buff Reader Test.");

         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Plz Input anything > ");
         //String inp = buf.readLine();
         StringBuffer inpbuff = new StringBuffer(buf.readLine());
         System.out.println("REVERSE>>> "+ inpbuff.reverse().toString());
    }
}
