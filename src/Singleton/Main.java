package Singleton;

public class Main {
    public static void main(String args[]){
        Singleton singleton = new Singleton();
        Instance a = singleton.getInstance();
        Instance b = singleton.getInstance();
        a.x = 100;
        System.out.println(b.x);
    }
}
