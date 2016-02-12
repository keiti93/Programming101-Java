package week07.Monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    private static FileUtils _instance;
        
    private FileUtils(){}
    
    private static FileUtils getInstance(){
        if (_instance ==null){
            _instance = new FileUtils();
        }
        return _instance;
    }
        
    public String readFrom(File file) throws IOException{
    
    BufferedReader in = null;
    StringBuilder result = new StringBuilder();
    
    try{
        in = new BufferedReader(new FileReader(file));
        String line;
        
        while((line = in.readLine()) != null){
            result.append(line);
            result.append(System.lineSeparator());
        }
        
    } finally{
        in.close();
    }
    return result.toString().trim();
    }
    
    public String readFrom(Path path) throws IOException{
        return readFrom(path.toFile());
    }
    
    
    public void writeTo(String str, File file) throws IOException{
        
        try (BufferedWriter buff = new BufferedWriter(new FileWriter(file))){
            buff.write(str);
            
        }  
    }
    
    public void writeTo(String str, Path path) throws IOException{
    writeTo(str, path.toFile());}
    
    
    public static void main(String[] args) throws IOException {
        File f = new File("/home/kate/Desktop/test.txt");
        FileUtils fu = FileUtils.getInstance();
        Path p2 = Paths.get("/home/kate/Desktop/test2.txt");
        Path p = Paths.get("/home/kate/Desktop/test.txt");
        
        System.out.println(fu.readFrom(f));
        System.out.println(fu.readFrom(p));
        fu.writeTo("this is a test", p2);
    }
}
