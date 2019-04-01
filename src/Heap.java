public class Heap extends SortStrategy {
    int[] arr = new int[10000010];
    int heapSize;
    @Override
    void sort() {
        heapSize = getSize()-1;
        buildheap(heapSize);
        arr = setArray( getSize(), getType(), arr);
        for(int i = heapSize; i >= 2; i--) {
            swap(1, i);
            heapSize-=1;
            heapify(1);
        }
    }

    @Override
    void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    @Override
    public String getName() {
        return "Heap";
    }

    void buildheap(int size){
        int start = size/2;
        for(int i = start; i > 0; i--)
            heapify(i);
    }

    void heapify(int index){
        int k;
        if(heapSize < 2*index ) return ;

        if((arr[2*index] == 0 && arr[2*index+1] == 0)) return ;

        if(heapSize >= index*2 +1){
            if(arr[2*index] > arr[2*index+1]) k = 2 * index;
            else k = 2* index + 1;
        }else
            k = 2*index;


        if(arr[index] >= arr[k])
            return ;

        swap(index, k);
        heapify(k);
    }

}
