public class subArrays {
    public static void printSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int start= i;
            for(int j=i;j<arr.length;j++){
                int end= j;
                for(int k = start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }

    }
    
    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        printSubArrays(array);
    }
}
