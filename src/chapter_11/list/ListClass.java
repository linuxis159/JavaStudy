package chapter_11.list;

import java.util.List;

public interface ListClass<E> {
    public boolean add(E e);
    public E get(int index);
    public E remove(int index);
    public E remove(E e);

}
