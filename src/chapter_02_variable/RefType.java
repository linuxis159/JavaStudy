package chapter_02_variable;

public class RefType {
    public static void main(String[] args){
        VariableInit.ThisClass thisClass = new VariableInit.ThisClass();
        System.out.println("ClassRef:"+thisClass);
        System.out.println("toString:"+thisClass.toString());
    }
}
