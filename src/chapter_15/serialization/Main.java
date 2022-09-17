package chapter_15.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String fileName = "Serialization.ser";



        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream in = new ObjectInputStream(bis);

        ClassForSerialization readingClassForSerialization = (ClassForSerialization)in.readObject();
        System.out.println("ImplementSerializeableClass:" + readingClassForSerialization.ImplementSerializeableClass.getClass().getSimpleName());
        System.out.println("nonImplementSerializeableClass:" + readingClassForSerialization.nonImplementSerializeableClass);
        System.out.println("name : "+ readingClassForSerialization.name +", age: " + readingClassForSerialization.age);
        System.out.println("serialVersionUID : " + readingClassForSerialization);



        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutput = new ObjectOutputStream(bufferedOutputStream);

        ClassForSerialization classForSerialization = new ClassForSerialization("KIM", "25");
        objectOutput.writeObject(classForSerialization);
        objectOutput.close();


    }
}
