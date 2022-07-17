//package chapter_09.object;
//
//import java.util.HashMap;
//import java.util.Objects;
//
//public class CustomHashMap {
//    static class Node {
//        final int hash;
//        final String key;
//        Object value;
//        Node next;
//
//        Node(int hash, String key, Object value, Node next){
//            this.hash = hash;
//            this.key = key;
//            this.value = value;
//            this.next = next;
//        }
//
//        public final String getKey() { return key; };
//
//        public final Object getValue() { return value; };
//
//        public final int hashcode() { return Objects.hashCode(key); }
//
//        public final Object setValue(Object newValue){
//            Object oldValue = value;
//            value = newValue;
//            return oldValue;
//        }
//
//        public final boolean equals(Object o){
//            if (o == this)
//                return true;
//
//        }
//    }
//
//    void put(String key, Object object){
//
//    }
//}
