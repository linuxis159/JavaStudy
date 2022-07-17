package chapter_08_exception;

import java.io.IOException;

public class ExceptionEx18_ChainException {
    public static void main(String[] args) {
        try {
            methodA(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void methodA(int num) throws IOException {
        try {
            if (num == 0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            IOException ioException = new IOException();
            ioException.initCause(e);  /// IOException의 예외를 IllegalArgumentException으로 지정/
            throw ioException;
        }
    }
}

