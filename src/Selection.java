public class Selection extends  SortStrategy{
    private int[] arr = new int[100001];

    @Override
    public void sort() {
        arr = setArray(getSize(), getType(), arr);

        for(int i = 0; i < getSize()-1; i++){
            int least = i;
            for(int j = i+1; j < getSize(); j++)
                if(arr[least] > arr[j])
                    least = j;

            if(i != least)
                swap(i, least);
        }
    }

    @Override
    public void swap(int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
