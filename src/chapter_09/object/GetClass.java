package chapter_09.object;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



public class GetClass {
    static class People{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void viewName(String name){
            System.out.println(name);
        }
    }
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        People people = new People();
        System.out.println("getName :"+People.class.getName());
        System.out.println("toString :"+People.class.toString());
        System.out.println("getClassLoader :"+People.class.getClassLoader());
        System.out.println("getMethods :"+People.class.getMethods());
        System.out.println("getTypeName :"+People.class.getTypeName());
        System.out.println();
        System.out.println("getName :"+people.getClass().getName());
        System.out.println("toString :"+people.getClass().toString());
        System.out.println("getClassLoader :"+people.getClass().getClassLoader());
        System.out.println("getMethods :"+people.getClass().getMethods());
        System.out.println("getTypeName :"+people.getClass().getTypeName());
        //메소드 이름, 매개변수 정보
        Method method = people.getClass().getMethod("viewName", String.class);

        method.invoke(people,"MyName");



    }
}
