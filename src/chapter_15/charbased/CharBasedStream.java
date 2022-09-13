package chapter_15.charbased;

import java.io.*;

public class CharBasedStream {
    public static void main(String[] args) throws IOException {
        String text = "1234하늘하늘かいしゃやめたい";
        FileOutputStream out = new FileOutputStream("test.txt");
        out.write(text.getBytes());
        FileReader in = new FileReader("test.txt");
        for(int i=0; i<text.length(); i++) {
            System.out.print((char)in.read());
        }

    }
}
