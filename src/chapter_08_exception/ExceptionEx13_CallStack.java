package chapter_08_exception;

public class ExceptionEx13_CallStack {
    public static void main(String args[]) {
        try {
            devide();
        } catch (ArithmeticException e){
            System.out.println("devide 함수에서 예외 발생 시 호출 된 곳에서 처리");
            e.printStackTrace();
        }

    }
    // 호출한 곳으로 예외 넘김
    static void devide() throws ArithmeticException{
        int number = 100;
        int result = 0;
        for(int i=0; i < 10; i++){
            result = number / (int) (Math.random() * 7);
            System.out.println(result);
        }

    }
}
