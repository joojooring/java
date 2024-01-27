package _05_java_class._08_generic.Prac;

class Pair<K, V>{

    private K key;
    private V value;

   public Pair(K key, V value){
       this.key=key;
       this.value=value;
   }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class GenericPrac1 {
    public static void main(String[] args) {
        Pair<String, Integer> generic1 = new Pair<>("One",1);
        System.out.println("Key : "+generic1.getKey() + ", Value : "+generic1.getValue());


        Pair<Integer,String> generic2 = new Pair<>(2,"Two");
        System.out.println("Key : "+generic2.getKey() + ", Value : "+generic2.getValue());
    }

}
