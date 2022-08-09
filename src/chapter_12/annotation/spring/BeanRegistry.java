package chapter_12.annotation.spring;

import chapter_12.annotation.spring.annotation.Service;

import java.lang.annotation.Annotation;

public class BeanRegistry {
    static class BeanResister {
        void scan(String basePackage) throws ClassNotFoundException {

            Class clazz = Class.forName(basePackage + ".SpringApplication");
            Annotation annotation = clazz.getAnnotation(Service.class);
            if(annotation != null){
                System.out.println("빈등록 ~");
            }


        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        BeanResister beanResister = new BeanResister();
        beanResister.scan("chapter_12.annotation.basepackages");
    }
}
