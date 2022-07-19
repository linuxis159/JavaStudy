package chapter_09.string;

public class StringLiteral {


    public static void main(String[] args){
        String string;

        /*
            string01, string02, "abc"
            참조값 동일
        */
        String string01 = "abc";
        String string02 = "abc";

        System.out.println(string01 == string02);
        System.out.println("abc" == string02);

        /* 생성자는 새로운 힙영역 할당하기 때문에 참조값 다름 */
        String string03 = new String("abc");
        System.out.println(string02 == string03);

    }
}
