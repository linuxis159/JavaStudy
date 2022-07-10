package chapter_08_exception;

public class ExceptionEx2 {

    public static  void main(String args[]){
        int number = 100;
        int result = 0;
        for(int i=0; i < 10; i++){
            //random에서 0 나오면 예외발생
            result = number / (int) (Math.random() * 7);
            System.out.println(result);
        }
    }
}
