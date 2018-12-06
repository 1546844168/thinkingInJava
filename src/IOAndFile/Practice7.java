package IOAndFile;

import java.io.*;
import java.util.LinkedList;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   19:46
 */
public class Practice7 {
    private static LinkedList<String> list = new LinkedList<>();

    public static void readLine(String fileName) throws IOException {
        Reader r = new FileReader(fileName);
        BufferedReader bfr = new BufferedReader(r);
        String s = null;
        while ((s = bfr.readLine()) != null) {
            list.add(s.toUpperCase());
        }
        bfr.close();
    }

    public static void main(String[] args) throws IOException {
        readLine("G:\\javaDevelopment\\ideaWorkSpace\\thinkingInJava\\src\\IOAndFile\\BufferInputFile.java");
        for (int i = list.size() - 1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
    }

}
