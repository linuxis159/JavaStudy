package chapter_15.stdio;

import java.io.IOException;

/*



*/
public class StandardIO {
    public static void main(String[] args) throws IOException {
        int input = 0;
        while((input = System.in.read()) != -1){
            System.out.println("input :" + input + ", (char) input:" + (char)input);
        }
    }
}
