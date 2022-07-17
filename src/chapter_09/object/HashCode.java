package chapter_09.object;
/*
1.equals가 두 객체가 같다고 판단했다면,
두 객체의 hashCode는 똑같은 값을 반환한다.

2.equals가 두 객체를 다르다고 판단했더라도,
hashCode는 꼭 다를 필요는 없다.

*/
public class HashCode {
    static class People{
        int height;
        int weight;
    }
    public static void main(String args[]){
        People people = new People();

        System.out.println(people.hashCode());
    }
}
