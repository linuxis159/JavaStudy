package chapter_06_oop;


import java.util.ArrayList;
import java.util.List;

public class Post {
    public static int postNum = 0;
    String description;
    // Post has a comment
    List<Comment> commentList = new ArrayList();

    Post(String description){
        postNum++;
        this.description = description;
    }
    void update(String description){
        this.description = description;
    }
    void writeComment(String commentDescription){
        Comment comment = new Comment(commentDescription);
        commentList.add(comment);
    }




}
