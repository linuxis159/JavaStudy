package chapter_12_generic;

public class GenericExtend {
    static class Fruit{
        void print(){
            System.out.println("I'm fruit");
        }
    }
    //Apple는 Fruit의 자식
    static class Apple extends Fruit{
        void print(){
            System.out.println("I'm apple");
        }
    }
    //이녀석이 AppleBox타입의 제네릭이 될 수 있을까요 ?
    static class Robot{
        void print() {
            System.out.println("I'm robot");
        }
    }
    //Fruit 이거나 Fruit를 상속받는 클래스만 가능하다고 하네요 ?
    static class AppleBox<T extends Fruit>{
        T item;
        void setBox(T item){
            this.item = item;
        }

        T getBox() {
            return this.item;
        }
    }



    public static void main(String[] args){
        //Apple은 Fruit의 자식이므로 가능
        AppleBox<Apple> appleBox = new AppleBox();
        //Robot은 Fruit의 자식이 아님
        //AppleBox<Robot> appleBox = new AppleBox();


    }
}
