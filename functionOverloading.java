public class functionOverloading {
    // multiple function with the same name but different parameters... 
     public static int sum(int a,int b) {
        return a+b;
     }
     public static int sum(int a,int b,int c) {
        return a+b+c;
     }
     public static float sum(float a,float b) {
        return a+b;
     }
    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(1, 4, 5));
        System.out.println(sum(10.5f, 11.2f));
        
    }
}
