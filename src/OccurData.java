import java.util.Random;

public class OccurData {
    int[] arr = new int[100001];

    public void RandomInitData(int size){
        Random randomGenerator = new Random();
        for(int i = 0; i < size; i++)
            arr[i] = randomGenerator.nextInt(size);
    }

    public void ReverseInitDat(int size){
        for(int i = 0; i < size; i++)
            arr[size-i] = i;
//        for(int i = 0; i < size; i++)
//            System.out.println(arr[i]);
    }
    public int[] getter(){
        return arr;
    }
}
