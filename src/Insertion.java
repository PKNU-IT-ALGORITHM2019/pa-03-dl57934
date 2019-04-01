public class Insertion extends SortStrategy{
    private int[] arr = new int[100001];

    @Override
    public void sort() {
        int j = 0;
        arr = setArray(getSize(), getType(), arr);
        for(int i = 1; i < getSize()-1; i++){
            int key = arr[i];
            for(j = i-1; j >= 0; j--)
                if(arr[j] < key)
                    arr[j+1] = arr[j];
            arr[j+1] = key;
        }
    }

    @Override
    public void swap(int a, int b) {

    }

    @Override
    public String getName() {
        return "Insertion";
    }


}
