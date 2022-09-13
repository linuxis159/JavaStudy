package chapter_15.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "Serialization.ser";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutput = new ObjectOutputStream(bufferedOutputStream);

        ClassForSerialization classForSerialization = new ClassForSerialization();
        objectOutput.writeObject(classForSerialization);
        objectOutput.close();


    }
}
