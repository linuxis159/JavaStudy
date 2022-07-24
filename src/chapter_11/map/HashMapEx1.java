package chapter_11.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("ikgyeong", "1234");
        map.put("ikgyeong", "5678");

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("ID 및 Password를 입력해주세요.");
            System.out.println("ID :");
            String id = s.nextLine().trim();

            System.out.println("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("ID 없음");
                continue;
            } else {
                if(!(map.get(id)).equals(password))
                    System.out.println("비밀번호  틀림");
                else{
                    System.out.println("로그인 성공");
                    break;
                }
            }

        }
    }
}
