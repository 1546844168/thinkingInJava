package ioandfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 潇潇暮雨
 * @create 2018-09-10   18:25
 */
public class BufferInputFile {

    public static void read(String fileName) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader(fileName));
        String s = null;
        while ((s = bfr.readLine()) != null){
            System.out.println(s);
        }
        bfr.close();
    }
    public static void main(String[] args) throws IOException {
        read("G:\\javaDevelopment\\ideaWorkSpace\\thinkingInJava\\src\\ioandfile\\BufferInputFile.java");
    }
}


