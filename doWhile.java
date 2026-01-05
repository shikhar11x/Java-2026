public class doWhile {
    public static void main(String[] args) {
        int n=1;
        do{
            System.out.println(n);
            n++;
            if (n==3) {
                continue;
            }
        }while(n<5);
    }
}
