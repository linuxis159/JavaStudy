package chapter_02_variable;

public class RefType {
    static class ThisClass{}
    public static void main(String[] args){
        ThisClass thisClass = new ThisClass();
        System.out.println("ClassRef:"+thisClass);
        System.out.println("toString:"+thisClass.toString());
    }
}
