public class HelloWorld{
    public static void main(String[] args){
        System.out.println("HelloWorld");
        int[] arr = new int[]{1,3,4,5,6,9};
        int target = 4;
        HelloWorld ccsd = new HelloWorld();
        System.out.println(ccsd.findNum(arr, target));
    }
    public int findNum(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

}