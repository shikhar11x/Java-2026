import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // While loop
        // int n=sc.nextInt();
        // int counter = 0;
        // while(counter<=n){
        //     System.out.println(counter);
        //     counter++;
        // }
        
        // *** Sum of first N no
        System.out.print("Enter the Limit :");
        int n= sc.nextInt();
        int sum=0;
        int counter=0;
        while (counter<=n){
            sum=sum+counter;
            counter++;
        }

        System.out.println("Sum is -> "+sum);

    }
}
