public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
        int[] arr = new int[]{1,3,4,5,6,9};
        int target = 6;
        HelloWorld ccsd = new HelloWorld();
        System.out.println(ccsd.findBinarySearch(arr, target));
    }
    // public int findNum(int[] arr, int target){
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    public int findBinarySearch(int[] arr, int k){
        int l = 0, r = arr.length - 1;
        int mid;
        while(l <= r){
            mid = l + (r-l)/2;
            if(k == arr[mid]){
                return mid;
            }
            if(k < arr[mid]){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

}