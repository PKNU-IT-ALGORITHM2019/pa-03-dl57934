import java.util.Random;

public class OccurData {
    int[] arr = new int[1000010];

    public void RandomInitData(int size){
        Random randomGenerator = new Random();
        for(int i = 1; i < size; i++)
            arr[i] = randomGenerator.nextInt(size-1)+1;
    }

    public void ReverseInitDat(int size){
        for(int i = 1; i < size; i++)
            arr[size-i] = i;
    }
    public int[] getter(){
        return arr;
    }
}
