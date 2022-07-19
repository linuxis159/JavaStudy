package chapter_09.rapper;

public class RapperClass {
    public static void main(String args[]){
        int integer01 = new Integer(100);
        System.out.println(integer01);

        int integer02 = new Integer(100).intValue();
        System.out.println(integer02);

        Integer boxingInteger = new Integer(100);
        int integer03 = boxingInteger + boxingInteger;
        System.out.println(integer03);

        int integer04 = 100 + integer03;
        System.out.println(integer04);
    }
}
