public class binarySearch {
     public static int bSearch(int arr[], int tgt){
        int start= 0;
        int end= arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;

            if (arr[mid]==tgt) {
                return mid;
            }
            if(arr[mid]<tgt){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
     }

    public static void main(String[] args) {
        int array[]={4,6,8,10,14,20};
        int target=14;
        System.out.println(bSearch(array, target));
    }
}
