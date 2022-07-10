package chapter_06_oop;


//SecrePost is a Post
public class SecretPost extends Post{
    String password;
    SecretPost(String password, String description){
        super(description);
        this.password = password;
    }

    @Override
    void writeComment(String commentDescription){
        Comment comment = new Comment(commentDescription);
        commentList.add(comment);
        System.out.println("비밀글에 댓글이 달렸습니다");
    }
}
