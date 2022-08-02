package chapter_12.annotation;

/*
    표준어노테이션
    @Override, @Deprecated, @SuppressWarings ...
    기능없이 단순히 컴파일러에 정보만 제공

*/


//@Override
/*
    @Target(ElementType.METHOD) -> 메타어노테이션
    @Retention(RetentionPolicy.SOURCE) -> 메타어노테이션
    public @interface Override {
    }
*/
public class AnotationOverride {
    static class Parent{
        void printClassName(){
            System.out.println("className: "+this.getClass().getSimpleName());
        }
    }

    static class Child extends Parent{
        @Override
        void printClassName(){
            System.out.println("overridingClassName: "+this.getClass().getSimpleName());
        }


        void printClassName(String className){
            System.out.println("overridingClassName: "+this.getClass().getSimpleName());
        }

    }

    public static void main(String[] args){
        Parent parent = new Parent();
        Child child = new Child();
        parent.printClassName();
        child.printClassName();

    }


}
