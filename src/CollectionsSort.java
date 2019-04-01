import java.util.Arrays;
import java.util.Collections;

public class CollectionsSort extends SortStrategy{
    int[] arr = new int[1000002];
    @Override
    void sort() {
        arr = setArray(getSize(), getType(), arr);
        Arrays.sort(arr);
    }

    @Override
    void swap(int a, int b) {

    }

    @Override
    public String getName() {
        return "Collections Sort";
    }
}
