public class MaxMin {
    public static void maxMin(Integer a,Integer b, Integer c){
        System.out.print("Max of given three numbers is: "+Math.max(Math.max(a,b),c)+"\n");
    }

    public static void main(String[] args) {
        maxMin(12,4,5);
        maxMin(12,45,34);
        maxMin(12,45,99);
    }
}