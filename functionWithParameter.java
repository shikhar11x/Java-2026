import java.util.Scanner;

public class functionWithParameter{

public static int calSum(int a, int b){ // parameter or formal parameter 
        int sum=a+b;
        return sum;
}
    public static void main(String[] args) {
    
    
        // *** Syntax ***
        /*
->      returnType name(type parameter 1, type parameter 2){
        body
        return Statement
        }
        */
       Scanner sc= new Scanner(System.in);
        System.out.print("Enter first no: ");
        int a= sc.nextInt();        
        System.out.print("Enter first no: ");
        int b= sc.nextInt();
        int sum= calSum(a,b);  // arguments or actual parameter 
        System.out.print("The sum is: "+ sum);


        sc.close();




    } 
}