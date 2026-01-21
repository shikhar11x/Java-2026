public class pairsInArray {
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+ arr[j]+")");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        int array[]={2,4,6,8,10};
        pair(array);
    }
}
