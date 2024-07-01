import java.util.*;

public class MaxMin <T extends Comparable<T>>{
    private List<T> values;
    public MaxMin(T... values){
        this.values = Arrays.asList(values);
    }
    public static <T extends Comparable<T>> void maxMin(List<T> values) {
        System.out.println(Collections.max(values));
    }
    public void printMax(){
        maxMin(this.values);
    }

    public static void main(String[] args) {
        MaxMin<Integer>int1=new MaxMin<>(12,33,56,78,33);
        MaxMin<Float>float1=new MaxMin<>(2.1f,34.1f,15.1f);
        MaxMin<String>string1=new MaxMin<>("Apple","Peach","Banana","Grapes");
        int1.printMax();
        float1.printMax();
        string1.printMax();

    }
}