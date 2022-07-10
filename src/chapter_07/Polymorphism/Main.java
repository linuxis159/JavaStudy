package chapter_07.Polymorphism;

public class Main {
    public static void main(String args[]){
        PolymorphismChild  polymorphismChild = new PolymorphismChild();
        PolymorphismParent polymorphismParent = new PolymorphismChild();
        System.out.println(polymorphismChild.variable);
        System.out.println(polymorphismParent.variable);

        polymorphismParent.print();
        polymorphismChild.print();
    }
}
