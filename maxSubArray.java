public class maxSubArray {
    public static void printSubArrays(int arr[]){

        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0;i<arr.length;i++){
            int start= i;
            for(int j=i;j<arr.length;j++){
                
                int end= j;
                currSum=0;
                for(int k = start;k<=end;k++){
                      currSum+=arr[k];                      
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);

    }
    
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        printSubArrays(array);
    }
}


