package chapter_11.set.hash;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args){
        Object[] objArr = {"1", new Integer(1), "2","2","3","3"};
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++){
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
}
