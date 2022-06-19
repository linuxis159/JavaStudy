package chapter_02_variable;

public class Literal {
    public static void main(String args[]){
        byte bt = (byte)1252; // 100 1110 0100 -> 100 1110 0 -> -28
        System.out.println(bt); // -1
        String str = "byte : "+ bt;
        System.out.println(str);

    }
}
