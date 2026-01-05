import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      
      boolean primeNo = true;
      for(int i=2;i<=n-1;i++){
        if (n%i==0) {
            primeNo=false;
        }
      }
      if (primeNo == true) {
        System.out.println(n+" is prime");
      }else{
        System.out.println(n+" is not prime");
        
      }
      sc.close();
    }
}
