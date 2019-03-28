public class Bubble  extends SortStrategy{
    int[] arr = new int[100001];

    @Override
    public void sort() {
        arr = setArray(getSize(), getType(), arr);
        for(int i = 0; i < getSize(); i++){
            for(int j = i+1; j < getSize(); j++)
                if(arr[i] > arr[j])
                    swap(i, j);
        }
    }

    @Override
    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
