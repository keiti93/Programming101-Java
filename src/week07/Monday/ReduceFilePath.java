package week07.Monday;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReduceFilePath {

    public static Path reducePath(Path path){
        return path.normalize();
    }
    
    public static void main(String[] args) {
        Path p1 = Paths.get("/home//radorado/code/./hackbulgaria/week0/../");
        System.out.println(reducePath(p1));

    }

}
