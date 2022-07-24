package chapter_11.set.tree;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args){
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("fan");
        set.add("abc");
        set.add("car");
        set.add("alien");

        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));

    }
}
