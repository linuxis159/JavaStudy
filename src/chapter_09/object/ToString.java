package chapter_09.object;

public class ToString {

    public static  void main(String args[]){


        Object a = new Object();
        Object b = new Object();
        Object c = a;
        //toString 출력으로 참조값 반환
        System.out.println(a.toString()); // java.lang.Object@7c30a502
        System.out.println(b.toString()); // java.lang.Object@49e4cb85
        System.out.println(c.toString()); // java.lang.Object@7c30a502





    }

}
