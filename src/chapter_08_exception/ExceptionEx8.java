package chapter_08_exception;

public class ExceptionEx8 {
    public static void main(String args[]){
        int number = 100;
        int result = 0;
        for(int i=0; i < 10; i++){
            try {
                result = number / (int) (Math.random() * 7);
                System.out.println(result);
            } catch (ArithmeticException e) {
                e.printStackTrace();
          }
        }

    }
}
