package chapter_02_variable;
/*boolean을 제외한 연산자는 서로 연산과 변환이 가능하다*/
public class PrimitiveType {
    public static void main(String[] args){
        boolean b = true;
        char character = 'a';
        byte bt = 127;
        short sht = 32767;
        int integer = 2147483647;
 /*       long ln = 9223372036854775807; ERROR */
        long ln = 9223372036854775807L;
/*        float flt = 3.4E38; ERROR */
        float flt = 3.4E38F;
        double db = 1.8E307;

/*        System.out.println((int)b) ERROR */
        System.out.println((short)integer); // -1
        System.out.println((int)ln); // -1
        System.out.println((int)sht); // 32767
        System.out.println((int)character); // 97
        System.out.println((int)flt); // 2147483647
        System.out.println((int)db); // 2147483647
        System.out.println((char)integer); // ￿
        System.out.println((long)integer); // 2147483647
        System.out.println((int)db); // 2147483647



        /*        bt = integer;*/
        integer = bt;
        db = flt;
        /*        flt = db;*/
        db = integer;
        /*     integer = db;*/

    }
}
