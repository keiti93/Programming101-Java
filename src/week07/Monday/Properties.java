package week07.Monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Properties {
    static Map<String, String> propertiesMap = new HashMap<>();

    public static Map<String, String> parseProperties(File file) throws IOException {
        List<String> newList = helper(file);

        for (String string : newList) {
            String[] parts = string.split("\\=", 2);
            propertiesMap.put(parts[0], parts[1]);
        }
        return propertiesMap;
    }

    public static List<String> helper(File file) throws IOException {
        BufferedReader in = null;
        List<String> lines = new ArrayList<>();

        try {
            in = new BufferedReader(new FileReader(file));
            String line;

            while ((line = in.readLine()) != null) {
                if (line.startsWith("#")) {
                    continue;
                } else {
                    lines.add(line);
                }
            }

        } finally {
            in.close();

        }
        return lines;
    }

    public static void toStr(Map<String, String> map) {
        for (String name : map.keySet()) {
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " : " + value);
        }

    }

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        File f = new File("/home/kate/Desktop/test.txt");
        Map<String, String> newm = (parseProperties(f));
        toStr(propertiesMap);
    }
}
