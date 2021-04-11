import java.io.*;
import java.nio.file.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) System.exit(1);
        Path path = Paths.get(args[0]);
        System.out.println("SIZE:"+Files.size(path));
    }
}
