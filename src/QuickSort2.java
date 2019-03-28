public class QuickSort2 extends  QuickSort{

    @Override
    public int getPivot(int start, int end, int[] arr){
        return getMiddleSizeNumber(start, end, arr);
    }

    int getMiddleSizeNumber(int start, int end, int[] arr){
        int mid = (start+end)/2;

        if((arr[start]<= arr[mid] && arr[mid] <= arr[end]) || (arr[end] <= arr[mid] && arr[mid] <= arr[start]))
            return arr[mid];
        else if((arr[mid]<= arr[start] && arr[start] <= arr[end]) || (arr[end] <= arr[start] && arr[start] <= arr[mid]))
            return arr[start];
        else
            return arr[end];
    }
}
