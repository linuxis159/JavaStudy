package chapter_08_exception;

public class ExceptionEx7 {
    public static void main(String args[]){
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
            // 일치하는 예외 처리
        } catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
            // 이미 일치하는 예외 처리 했기 때문에 실행되지 않음
        } catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6);

    }
}
