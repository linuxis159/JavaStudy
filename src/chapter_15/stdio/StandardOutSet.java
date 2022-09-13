package chapter_15.stdio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/*
표준입출력 변경
*/
public class StandardOutSet {
    public static void main(String[] args) throws IOException {

        for(int i=1; i<=10; i++){
            String fileName = i+".txt";
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            PrintStream printStream = new PrintStream(fileOutputStream);
            System.setOut(printStream);
            System.out.println("파일명 : "+ fileName);
        }
    }
}
