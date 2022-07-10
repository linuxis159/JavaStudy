package chapter_08_exception;

public class CreateException1{

    static class MyException extends RuntimeException{
        private final int ERR_CODE;

        MyException(String msg, int errCode){
            super(msg);
            ERR_CODE = errCode;
        }

        MyException(String msg){
            this(msg, 100);
        }

        public int getErrCode(){
            return ERR_CODE;
        }
    }

    public static void main(String args[]){
        throw new MyException("예외발생");

    }


}
