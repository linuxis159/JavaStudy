package chapter_12_generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GenericWildCard {
    static class Fruit{
        int weight = 0;
        void print(){
            System.out.println("I'm fruit");
        }
    }

    //Apple는 Fruit의 자식
    static class Apple extends Fruit {
        static int index = 0;
        int currentIndex = 0;
        Apple(int weight){
            super.weight = weight;
            index++;
            this.currentIndex = index;
        }
        public String toString(){
            return this.currentIndex+"번"+this.getClass().getSimpleName();
        }
    }

    static class Grape extends Fruit {
        static int index = 0;
        int currentIndex = 0;
        Grape(int weight){
            super.weight = weight;
            index++;
            this.currentIndex = index;
        }
        public String toString(){
            return this.currentIndex+"번"+this.getClass().getSimpleName();
        }
    }

    //이녀석이 AppleBox타입의 제네릭이 될 수 있을까요 ?
    static class Robot{
        void print() {
            System.out.println("I'm robot");
        }
    }
    //Fruit 이거나 Fruit를 상속받는 클래스만 가능하다고 하네요 ?
    static class FruitBox<T extends Fruit>{
        List<T> list = new ArrayList();
        T item;
        void add(T item){
            list.add(item);
        }

        T get(int index) {
            return list.get(index);
        }
    }

    static class Juice{
        static int index = 0;
        String juiceId;
        Juice(String juiceId){
            this.juiceId = juiceId;
        }
        @Override
        public String toString(){
            return juiceId;
        }
    }

    static class Juicer{
        static Juice makeJuice(FruitBox<? extends Fruit> box){
            return new Juice(box.get(0).toString());
        }
    }

    static class FruitComp implements Comparator<Fruit>{

        @Override
        public int compare(Fruit o1, Fruit o2) {
            return o1.weight - o2.weight;
        }
    }




    public static void main(String[] args){
        Apple apple1 = new Apple(60);
        Apple apple2 = new Apple(20);
        Apple apple3 = new Apple(40);
        Apple apple4 = new Apple(30);
        Grape grape1 = new Grape(10);
        Grape grape2 = new Grape(70);
        Grape grape3 = new Grape(50);
        Grape grape4 = new Grape(40);
        FruitBox<Apple> appleBox = new FruitBox();
        FruitBox<Grape> grapeBox = new FruitBox();
        appleBox.add(apple1);
        appleBox.add(apple2);
        appleBox.add(apple3);
        appleBox.add(apple4);

        grapeBox.add(grape1);
        grapeBox.add(grape2);
        grapeBox.add(grape3);
        grapeBox.add(grape4);
        // public static <T extends Comparable<? super T>> void sort(
        // T는 Comparable을 구현해야하고 Comparable에는 T의 부모클래스들도 올 수 있습니다
        //
        Collections.sort(appleBox.list, new FruitComp());
        Collections.sort(grapeBox.list, new FruitComp());
        for(Apple apple : appleBox.list){
            System.out.println(apple.weight);
        }

        for(Grape grape : grapeBox.list){
            System.out.println(grape.weight);
        }



    }
}
