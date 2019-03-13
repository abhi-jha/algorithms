package abhishek.algorithms.searching;

public class Binary {
    public int binarySearch(int[] array, int low, int high, int num){
        int mid = (high + low)/2;
        if(array[mid]==num)
            return mid;
        else if(array[mid+1]<num)
             binarySearch(array, low, mid-1,num );
        else if(array[mid-1]>num)
             binarySearch(array,mid+1,high,num);
        return -1;
    }
}
