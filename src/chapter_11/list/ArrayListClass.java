package chapter_11.list;

import java.util.ArrayList;

public class ArrayListClass<E> implements ListClass<E>{
    Object data[] = null;
    int capacity = 0;
    int size = 0;


    public ArrayListClass(int capacity){
        if(capacity < 0)
            throw new IllegalArgumentException("0 보다 큰수를 넣어주세요");
        this.capacity = capacity;
        data = new Object[capacity];
    }
    public ArrayListClass(){
        this(10);
    }

    void checkArrayBound(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("범위를 벗어났습니다");
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }

    public boolean add(E e){
        ensureCapacity(size+1);
        data[size++] = e;
        return true;
    }

    public E get(int index) {
        checkArrayBound(index);
        return (E)data[index];
    }

    public E remove(int index){
        E oldObj = null;
        checkArrayBound(index);
        oldObj = (E)data[index];

        if(index != size-1)
            System.arraycopy(data, index+1, data, index, size-index-1);
        data[size-1] = null;
        size--;
        return oldObj;
    }

    public E remove(E e){
        E oldObj = null;
        for(int i=0; i<size; i++){
            if(e.equals(data[i])) {
                oldObj = remove(i);
            }
        }
        return oldObj;
    }

    public void trimToSize(){
        setCapacity(size);
    }

    private void setCapacity(int capacity) {
        if (this.capacity == capacity) return;
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
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
    public int size() { return size; }

}
