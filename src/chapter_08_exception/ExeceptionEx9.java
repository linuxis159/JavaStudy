package chapter_08_exception;

public class ExeceptionEx9 {
    public static void main(String[] args){
        try{
            Exception e = new Exception("예외");
            throw e;
        } catch (Exception e){
            System.out.println("에러 메세지:" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("종료");
    }
}
