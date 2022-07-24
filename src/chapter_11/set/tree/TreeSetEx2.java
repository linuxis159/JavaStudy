package chapter_11.set.tree;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args){
        TreeSet set = new TreeSet();
        int[] score = {80,95,1000,10001,10002,500,1002,999};

        for(int i=0; i< score.length; i++)
            set.add(new Integer(score[i]));
        System.out.println("1000보다 작은 값 :" + set.headSet(new Integer(1000)));
        System.out.println("1000보다 큰 값 :" + set.tailSet(new Integer(1000)));

    }
}
