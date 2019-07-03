package main.java.com.stackroute.pe2;

import java.io.*;

public class ReadFile {
    //program to read the file
    public static String checkReadFile(File file) {
        String line="";
        String rev="";
        int len=0;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fr);
            while((line = bufferedReader.readLine())!=null)
            {
                rev=rev.concat(line);

            }
            len=rev.length();
            bufferedReader.close();
        } catch (IOException e) {
            return "not found";
        }
        return rev.toUpperCase();
    }

}