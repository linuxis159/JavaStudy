package chapter_11.list;

import chapter_11.list.ArrayListClass;

public class ArrayListMain {
    public static void main(String[] args){
        ArrayListClass<Integer> arrayListClass = new ArrayListClass();
        arrayListClass.add(50);
        System.out.println(arrayListClass.get(1));
    }
}
