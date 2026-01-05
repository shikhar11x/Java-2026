public class revOfNo {
    public static void main(String[] args) {
         int n=10899;
        int rev=0;
        int id=0;
        // get last digit = no % 10
        // remove last digit = n/10
        System.out.println("no is -> "+n);
        System.out.println("reversed no");
        while(n>0){
            id=n%10;
            n=n/10;
            rev=(rev*10)+id;
        }
    System.out.println(rev);}
    
}
