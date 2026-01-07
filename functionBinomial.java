public class functionBinomial {
        public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;

    }
        public static int binomial(int n, int r){
            int nFact= factorial(n);
            int rFact= factorial(r);
            int nMrFact = factorial(n-r);
            int fact= nFact/(rFact*nMrFact);
            return fact;
        }
    public static void main(String[] args) {
        System.out.println(binomial(5, 2));
    }
}
