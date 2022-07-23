package chapter_11.stack;

public class StackMain {
    public static void main(String[] args){
        StackClass<Integer> stack = new StackClass();
        stack.push(10);
        System.out.println(stack.pop());
        System.out.println(stack.push(20));
        System.out.println(stack.pop());

    }
}
