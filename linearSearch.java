public class linearSearch {
    public static int linearSrch(int n[], int key){
        for(int i=0;i<n.length;i++){ // time complexity O(n) where n is no of time loop runs
            if (n[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index=linearSrch(num, key);
        if (index==-1) {
            System.out.println("Value does not exist");
        }else
        System.out.println("key is at "+linearSrch(num, key));
    }
}
