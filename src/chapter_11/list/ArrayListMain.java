package chapter_11.list;

import chapter_11.list.ArrayListClass;

public class ArrayListMain {
    public static void main(String[] args){
        LinkedListClass<Integer> linkedListClass = new LinkedListClass();
        linkedListClass.add(10);
        linkedListClass.add(20);
        linkedListClass.add(30);
        System.out.println(linkedListClass.get(0));
        System.out.println(linkedListClass.get(1));
        System.out.println(linkedListClass.get(2));
        linkedListClass.remove(1);
        System.out.println(linkedListClass.get(0));
        System.out.println(linkedListClass.get(1));


    }
}
