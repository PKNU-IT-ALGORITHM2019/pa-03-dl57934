public class QuickSort1 extends QuickSort {

    @Override
    public int getPivot(int start, int end, int[] arr) {
        return arr[getSize()-1];
    }
}
