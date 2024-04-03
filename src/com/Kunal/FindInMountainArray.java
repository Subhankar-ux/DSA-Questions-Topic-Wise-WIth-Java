package com.Kunal;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[]arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBinarySearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[]arr){
        int start = 0;
        int end = arr.length -1;
        while (start<end){
            //creating our mid - index
            int mid = start + (end - start)/2;

            if (arr[mid]<arr[mid+1]){
                //you are in the ascending/increasing part of the array
                start = mid +1;//because we know that mid+1 element> mid - element,so we can ignore mid element here
            }else if(arr[mid]>arr[mid+1]){
                //you are in the descending part of the mountain array
                //this arr[mid] may be the ans,but look or search
                // in the left if there exist some possible element greater than mid
                //this is why end != mid -1
                end = mid;
            }
        }
        //in the end , start == end  and pointing to the largest number because of the above two checks
        //more elaboration : at every point of time for start and end ,they have the best possible answer till that time
        //and if we are saying that only one element is remaining ,hence cuz of above line that is the best possible ans
        return start;//at the end of loop start= = end . so we can return any of these
    }


    static int orderAgnosticBinarySearch(int[]arr,int target,int start,int end){
         boolean isAscending = arr[start]<arr[end];
        while (start<=end){
            int mid = start +(end - start)/2;
            if (target == arr[mid]){
                return mid;
            }
            if (isAscending){
                  if (target<arr[mid]){
                      end = mid -1;
                  }else{
                      start = mid + 1;
                  }
            } else {
                if(target<arr[mid]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }

}

    //Method For find peak/pivot element in the mountain array
