public class MaxMin {
    public static void maxMin(Integer a,Integer b, Integer c){
        System.out.print("Max of given three numbers is: "+Math.max(Math.max(a,b),c)+"\n");
    }
    public static void maxMin(float a,float b, float c){

        System.out.print("Max of given three numbers is: "+Math.max(Math.max(a,b),c)+"\n");
    }

    public static void main(String[] args) {
        maxMin(12,4,5);
        maxMin(12,45,34);
        maxMin(12,45,99);
        maxMin(12.1f,4.1f,5.1f);
        maxMin(12.2f,45.2f,34.2f);
        maxMin(12.3f,45.3f,99.3f);
    }
}