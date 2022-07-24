package chapter_11.set.hash;

import java.util.HashSet;

public class HashSetEx3 {
    static class Person{
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return name +":"+ age;
        }

        @Override
        public boolean equals(Object obj){
            if(obj instanceof Person){
                Person tmp = (Person)obj;
                return name.equals(tmp.name) && age == tmp.age;
            }
            return false;
        }

        @Override
        public int hashCode(){
            return (name+age).hashCode();
        }

    }
    public static void main(String[] args){
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("김익경",100));
        set.add(new Person("김익경",100));
        System.out.println(set);
    }
}
