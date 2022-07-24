/*
package chapter_11.queue;

import chapter_11.list.ArrayListClass;

import java.util.PriorityQueue;

public class PriorityQueueClass<E> {
    ArrayListClass<E> arrayList = new ArrayListClass();
    int size;

    public PriorityQueueClass(){
        size = 0;
    }

    boolean add(E e){
        size++;
        ArrayListClass.add(e);
        return true;
    }
    E remove(){
        E e = arrayList.getFirst();
        arrayList.remove(e);
        return e;
    }
    E element(){
        return arrayList.getFirst();
    }
    boolean offer(E e){
        return arrayList.add(e);
    }
    E poll(){
        E e = arrayList.getFirst();
        arrayList.remove(e);
        return e;
    }
    E peek(){
        E e = arrayList.getFirst();
        return e;
    }



}
*/
