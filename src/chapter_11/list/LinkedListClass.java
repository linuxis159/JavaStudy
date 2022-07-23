package chapter_11.list;

import java.util.LinkedList;

public class LinkedListClass<E> {
    private int size;
    Node<E> first;
    Node<E> last;
    class Node<E> {
        Node next;
        Node previous;
        E e;

        Node(E e){
            this.e = e;
        }
    }




    void checkListBound(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다");
    }
    public boolean add(E e){
        Node newNode = new Node(e);
        if(size == 0){
            first = newNode;
            first.next = null;
            first.previous = null;

            last = newNode;
            last.next = null;
            last.previous = null;
            size++;
            return true;
        }
        last.next = newNode;
        newNode.previous = last;
        last = newNode;
        size++;
        return true;
    }

    public E get(int index){
        checkListBound(index);
        return getNodeByIndex(index).e;
    }

    public E remove(int index){
        checkListBound(index);
        Node<E> oldObj = getNodeByIndex(index);
        oldObj.previous.next = oldObj.next;
        oldObj.next.previous = oldObj.previous;
        size--;
        return oldObj.e;
    }
    private Node<E> getNodeByIndex(int index){
        Node<E> node = first;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

/*    public boolean remove(E e){
        for(int i=0; i<size; i++){
            if(e.equals(data[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void clear(){
        for(int i=0; i < size; i++)
            data[i] = null;
        size = 0;
    }

    public Object[] toArray(){
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);
        return result;
    }

    public boolean isEmpty(){ return size==0; }
    public int capacity() { return capacity; }
    public int size() { return size; }*/
}
