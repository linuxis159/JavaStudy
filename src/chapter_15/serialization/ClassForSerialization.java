package chapter_15.serialization;

import java.io.Serializable;

public class ClassForSerialization implements Serializable {
    String name;
    String age;

     transient NonImplementSerializeableClass nonImplementSerializeableClass = new NonImplementSerializeableClass();
    ImplementSerializeableClass ImplementSerializeableClass = new ImplementSerializeableClass();

    public ClassForSerialization(String name, String age){
        this.name = name;
        this.age = age;

    }




}
