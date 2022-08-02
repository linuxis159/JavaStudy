package chapter_12_generic;

import com.sun.jdi.event.ClassPrepareEvent;

import java.lang.reflect.Array;

public class GenericArray {
    static class Box<T>{
        T[] itemArr; // T타입 배열을 위한 참조변수
        //T[] temArr = new T[itemArr.length]; -> new연산자는 컴파일 시점에서 타입을 정확히 알아야 함
        T[] temArr1 = (T[])new Object[itemArr.length];


    }
}
