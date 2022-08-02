package chapter_12_generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
    1.클래스에 정의된 타입매개변수와는 별개
    2.메서드내에서만 지역적으로 사용됨
    3,생략가능

*/
public class GenericMethod {
    //public static <T extends Comparable<? super T>> void sort(List<T> list)
    static class Fruit implements Comparable<Fruit>{
        int weight = 0;
        void print(){
            System.out.println("I'm fruit");
        }

        @Override
        public int compareTo(Fruit o) {
            return this.weight - o.weight;
        }
    }

    //Apple는 Fruit의 자식
    static class Apple extends GenericWildCard.Fruit {
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

    static class Grape extends GenericWildCard.Fruit {
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
    static class FruitBox<T extends GenericWildCard.Fruit>{
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
        static GenericWildCard.Juice makeJuice(GenericWildCard.FruitBox<? extends GenericWildCard.Fruit> box){
            return new GenericWildCard.Juice(box.get(0).toString());
        }
    }

    static class FruitComp implements Comparator<GenericWildCard.Fruit> {

        @Override
        public int compare(GenericWildCard.Fruit o1, GenericWildCard.Fruit o2) {
            return o1.weight - o2.weight;
        }
    }

    public static void main(String[] args){
        GenericWildCard.Apple apple1 = new GenericWildCard.Apple(60);
        GenericWildCard.Apple apple2 = new GenericWildCard.Apple(20);
        GenericWildCard.Apple apple3 = new GenericWildCard.Apple(40);
        GenericWildCard.Apple apple4 = new GenericWildCard.Apple(30);
        GenericWildCard.Grape grape1 = new GenericWildCard.Grape(10);
        GenericWildCard.Grape grape2 = new GenericWildCard.Grape(70);
        GenericWildCard.Grape grape3 = new GenericWildCard.Grape(50);
        GenericWildCard.Grape grape4 = new GenericWildCard.Grape(40);
        GenericWildCard.FruitBox<GenericWildCard.Apple> appleBox = new GenericWildCard.FruitBox();
        GenericWildCard.FruitBox<GenericWildCard.Grape> grapeBox = new GenericWildCard.FruitBox();
        appleBox.add(apple1);
        appleBox.add(apple2);
        appleBox.add(apple3);
        appleBox.add(apple4);

        grapeBox.add(grape1);
        grapeBox.add(grape2);
        grapeBox.add(grape3);
        grapeBox.add(grape4);
        //  <T> void sort(List<T> list, Comparator<? super T> c)
        //  Collections.sort(appleBox.list, new GenericWildCard.FruitComp());
        //  Collections.sort(grapeBox.list, new GenericWildCard.FruitComp());
        for(GenericWildCard.Apple apple : appleBox.list){
            System.out.println(apple.weight);
        }

        for(GenericWildCard.Grape grape : grapeBox.list){
            System.out.println(grape.weight);
        }

    }
}
