package chapter_11.stack;

import chapter_11.list.LinkedListClass;

import java.util.LinkedList;
import java.util.Stack;

//항상 첫번째 데이터만 삭제하므로
//LinkedList가 적절함
public class StackClass<E> {

    private int size;
    private LinkedListClass<E> linkedList = new LinkedListClass();

    public StackClass(){
        size = 0;
    }

    public boolean empty(){
        if(size <= 0)
            return true;
        else
            return false;
    }

    public E pop() {
        size--;
        E last = linkedList.getLast();
        linkedList.remove(last);
        return last;
    }

    public E push(E e){
        size++;
        linkedList.add(e);
        return e;
    }

    int search(E e){
/*        if(e == linkedList.get(e))*/
            return 0;
    }



}
