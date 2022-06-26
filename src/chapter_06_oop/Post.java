package chapter_06_oop;


public class Post {
    public static int postNum = 0;
    String description;
    Post(){
        postNum++;
    }

    void modify(){

    }
    public static void viewPostNum(){
        System.out.println(postNum);
        System.out.println(description);

    }



}
