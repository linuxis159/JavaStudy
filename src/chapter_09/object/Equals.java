package chapter_09.object;

public class Equals {

    public static  void main(String args[]){
        Object a = new Object();
        Object b = new Object();
        Object c = a;

        System.out.println(a == b); // false
        System.out.println(a == c); // true

        System.out.println(a.equals(b)); // false
        System.out.println(a.equals(c)); // true

/*
        Object 클래스의 eqauls 메소드 선언
        public boolean equals(Object obj) {
            return (this == obj);
        }
*/

    }
}

