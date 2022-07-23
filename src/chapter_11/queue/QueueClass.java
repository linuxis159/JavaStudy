package chapter_11.queue;

import chapter_11.list.LinkedListClass;

public class QueueClass<E> {
    private LinkedListClass<E> linkedListClass = new LinkedListClass();
    private int size;

    public QueueClass(){
        size = 0;
    }

    boolean add(E e){
        size++;
        linkedListClass.add(e);
        return true;
    }
    E remove(){
        E e = linkedListClass.getFirst();
        linkedListClass.remove(e);
        return e;
    }
    E element(){
        return linkedListClass.getFirst();
    }
    boolean offer(E e){
        return linkedListClass.add(e);
    }
    E poll(){
        E e = linkedListClass.getFirst();
        linkedListClass.remove(e);
        return e;
    }
    E peek(){
        E e = linkedListClass.getFirst();
        return e;
    }



}
