package Poject5;

public class Max {
    public static void main(String[] args) {
        int[] arr = {87 ,65, 84, 95, 986, 64};
        System.out.println(max(arr));
        System.out.println(maxrange(arr, 0, 3));
    }
// Finding the max no.
    static int max(int[] arr){
        if(arr.length == 0 ){
            return -1;
        }
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

// Finding the max number from given range
    static int maxrange(int[] arr, int start, int end){
        if(start>end){
            return -1;
        }
        if(arr==null){
            return -1;
        }

        int maxval = arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
