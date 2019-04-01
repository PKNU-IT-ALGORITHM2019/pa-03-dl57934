public class QuickSort1 extends QuickSort {

    @Override
    public int getPivot(int start, int end, int[] arr) {
        return arr[getSize()-1];
    }

    @Override
    public String getName(){
        return "Quick1";
    }
}
