package week07.Monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Encoding {

    public static void fixEncoding(File file) throws IOException {
        
        BufferedReader reader = Files.newBufferedReader(Paths.get(file.getName()), Charset.forName("windows-1251"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("encoded"));
        String line;
        
        while ((line = reader.readLine()) != null) {
          System.out.println(line + System.lineSeparator());
          writer.write(line + System.lineSeparator());

        }
        writer.close();
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("/Programming101-myJava/lost.s04e11.hdtv.xvid-2hd.srt");
        fixEncoding(file);
    }
}
