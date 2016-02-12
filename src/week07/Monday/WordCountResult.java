package week07.Monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCountResult {

    public int wordCount = 0;
    public int lineCount = 0;
    public int charCount = 0;

    public WordCountResult(int words, int lines, int chars) {
        wordCount = words;
        lineCount = lines;
        charCount = chars;
    }

    public String toString() {
        return "Number of words: " + wordCount + "\nNumber of lines: " + lineCount + "\nNumber of characters: "
                + charCount;
    }
  

    public static WordCountResult wordCount(File file) throws IOException {
        BufferedReader input = null;
        int words = 0;
        int lines = 0;
        int chars = 0;
        String line;

        try {
            input = new BufferedReader(new FileReader(file));
            while ((line = input.readLine()) != null) {
                lines++;
                int endOfLine = line.length() - 1;
                boolean word = false;
                chars += line.length();

                for (int i = 0; i < line.length(); i++) {
                    if (Character.isLetter(line.charAt(i)) && i != endOfLine) {
                        word = true;
                    } else if ((!Character.isLetter(line.charAt(i)) && line.charAt(i) != '-' && line.charAt(i) != '\'')
                            && word) {
                        words++;
                        word = false;

                    } else if (Character.isLetter(line.charAt(i)) || line.charAt(i) == '\'' && i == endOfLine) {
                        words++;
                    }
                }
            }
        } finally {
            input.close();
        }

        return new WordCountResult(words, lines, chars);
    }
    
    public static WordCountResult wordCount(Path path) throws IOException{
        return wordCount(path.toFile());
    }

    public static void main(String[] args) throws IOException {
        Path f = Paths.get("/home/kate/Desktop/test.txt");
        System.out.println(wordCount(f).toString());

    }
}
