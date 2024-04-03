package BasicMath;

public class SearchSingleElement {
    public static void main(String[] args) {
        int[]arr = {2,4,5,2,5,4,3,6,6};
        System.out.println(single(arr));
    }
    static int single(int[]arr){
        int sing = 0;
        for(int i=0;i<arr.length;i++){
            sing = sing ^ arr[i];
        }
        return sing;
    }
}
