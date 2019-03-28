import java.util.Random;

public class QuickSort3 extends QuickSort{
    private Random random;
    public QuickSort3() {
        random = new Random();
    }

    @Override
    public int getPivot(int start, int end, int[] arr) {
        return arr[random.nextInt(getSize()-1)];
    }
}
