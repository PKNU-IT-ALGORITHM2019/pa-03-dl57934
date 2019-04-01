public class MergeSort extends SortStrategy{
    private int arr[] = new int[100001];
    private int temp[] = new int[100001];

    @Override
    public void sort() {
        arr = setArray(getSize(), getType(), arr);
        mergeSort(1, getSize()-1);
    }

    public void mergeSort(int start, int end){
        if(start < end){
            int mid = (start+end)/2;
            mergeSort(start, mid);
            mergeSort(mid+1, end);
            merge(start, mid, end);
        }
    }

    public void merge(int start, int mid, int end){
        for(int i = start; i<= end; i++)
            temp[i] = arr[i];
        int part1 = start, index = start;
        int part2 =mid+1;

        while(part1 <= mid && part2 <= end){
            if(temp[part1] < temp[part2]){
                arr[index] = temp[part1];
                part1++;
            }else{
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }

        for(int i = 0; i <= mid-part1; i++)
            arr[index+i] = temp[part1+i];

    }

    @Override
    public void swap(int a, int b) {

    }

    @Override
    public String getName() {
        return "Merge";
    }
}
