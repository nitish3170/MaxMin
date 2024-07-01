public class MaxMin {
//    public static void maxMin(Integer a,Integer b, Integer c){
//        System.out.print("Max of given three Integers is: "+Math.max(Math.max(a,b),c)+"\n");
//    }
//    public static void maxMin(float a,float b, float c){
//
//        System.out.print("Max of given three float is: "+Math.max(Math.max(a,b),c)+"\n");
//    }
//    public static void maxMin(String a, String b, String c){
//        String mx= a.compareTo(b)>0?a:b;
//        mx= mx.compareTo(c)>0?mx:c;
//        System.out.print("Max of given Strings is: "+mx+"\n");
//    }
    public static <T extends Comparable<T>> void maxMin(T a, T b, T c) {
        T max = a.compareTo(b) > 0 ? a : b;
        max = max.compareTo(c) > 0 ? max : c;
        System.out.println("Max of given values is: " + max);
    }

    public static void main(String[] args) {
        maxMin(Integer.valueOf(12),Integer.valueOf(4),Integer.valueOf(5));
        maxMin(Integer.valueOf(12),Integer.valueOf(45),Integer.valueOf(34));
        maxMin(Integer.valueOf(12),Integer.valueOf(34),Integer.valueOf(99));
        maxMin(12.1f,4.1f,5.1f);
        maxMin(12.2f,45.2f,34.2f);
        maxMin(12.3f,45.3f,99.3f);
        maxMin("Apple","Peach","Banana");
    }
}