//package chapter_08_exception;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.*;
//
//public class ExceptionFinallyTest1 {
//    public static void main(String[] args) throws SQLException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//            try {
//                SqlSession session = sqlSessionFactory.openSession(true)
//                session.selectOne("ArticleMapper.insertArticle",dto);
//                //try - with -resources를 사용하면 더 깔끔하게 작성 가능
//            }finally {
//                try {
//                    if (session != null)
//                        session.close();
//                }catch (IOException e){
//                    e.printStackTrace();
//                }
//            }
//    }
//}
