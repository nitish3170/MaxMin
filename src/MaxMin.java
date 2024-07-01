import java.util.Arrays;

public class MaxMin <T extends Comparable<T>>{
    private T a;
    private T b;
    private T c;
    public MaxMin(T a, T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static<T extends Comparable<T>> void maxMin(T a , T b, T c){
        T max = a.compareTo(b) > 0 ? a : b;
        max = max.compareTo(c) > 0 ? max : c;
        System.out.println("Max of given values is: " + max);
    }
    public void maxMin() {
        maxMin(a,b,c);
    }
    @SafeVarargs
    public static <T extends Comparable<T>> T maxMin(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }

    public static void main(String[] args) {
        MaxMin<Integer>int1=new MaxMin<>(12,4,5);
        maxMin(12,33,56,78,33);
        MaxMin<Float>float1=new MaxMin<>(12.1f,4.1f,5.1f);
        maxMin(2.1f,34.1f,15.1f);
        MaxMin<String>string1=new MaxMin<>("Apple","Peach","Banana");
        maxMin("Apple","Peach","Banana","Grapes");
        int1.maxMin();
        float1.maxMin();
        string1.maxMin();

    }
}