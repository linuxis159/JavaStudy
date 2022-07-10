package chapter_08_exception;


public class ExceptionEx3 {

    public static  void main(String args[]){
        int number = 100;
        int result = 0;
        for(int i=0; i < 10; i++){
            //random에서 0 나오면 예외발생
            try {
                result = number / (int) (Math.random() * 7);
                System.out.println(result);
                // ArithmeticException 이 아니러면 예외처리 되지 않음
                // ArithmeticException 발생 시 catch문 안에 있는 로직 실행
                // 발생예외 instanceof catch 블록안의 예외
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다 ");
            } catch(Exception e){
                System.out.println("알 수 없는 예외발생");
            }
        }
    }
}

