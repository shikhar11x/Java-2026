public class largestNoInArray {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i=1;i<arr.length;i++){
            if (largest<arr[i]) {
                largest=arr[i];
            }
        }
        
        return largest;

    }
    public static void main(String[] args) {
        int num[]= {1,2,6,3,5};
        System.out.println(getLargest(num));

    }
}
