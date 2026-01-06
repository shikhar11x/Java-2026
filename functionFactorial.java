import java.util.Scanner;

public class functionFactorial {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no : ");
        int a = sc.nextInt();
        System.out.println(factorial(a));
        sc.close();
    }
}
