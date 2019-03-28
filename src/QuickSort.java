public class QuickSort extends SortStrategy{
    private int[] arr = new int[1000010];

    @Override
    public void sort() {
        arr = setArray(getSize(), getType(), arr);
        quickSort(0, getSize() -1);
    }

    @Override
    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public void quickSort(int start, int end){
        if(start < end){
            int mid = partition(start, end);
            if(start < mid-1)
                quickSort(start, mid-1);
            if (mid < end)
                quickSort(mid, end);
        }
    }

    public int partition(int start, int end){
        int pivot = arr[(start+end)/2];
        while (start <= end){
            while(pivot > arr[start]) start++;
            while(pivot < arr[end]) end--;

            if(start <= end){
                swap(start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public int getPivot(int start, int end, int arr[]){
        return start;
    }

//    public int[] getArr(){
//        return arr;
//    }
}
