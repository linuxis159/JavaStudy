//package chapter_08_exception;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.*;
//
//public class ExceptionResource {
//    public static void main(String[] args) throws SQLException, IOException {
//
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        // 예외발생시 close 함수 자동호출
//        try (SqlSession session = sqlSessionFactory.openSession(true)) {
//            session.selectOne("ArticleMapper.insertArticle", dto);
//        }
//    }
//}
