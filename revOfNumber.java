public class revOfNumber {
    public static void main(String[] args) {
        int n=10899;

        // get last digit = no % 10
        // remove last digit = n/10
        System.out.println("no is -> "+n);
        System.out.println("reversed no");
        while(n>0){
            System.out.print(n%10);
            n=n/10;
        }
    }
}
