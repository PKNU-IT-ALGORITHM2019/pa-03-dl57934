public abstract class SortStrategy {
    final static int RANDOM = 0, REVERSE = 1;
    private  OccurData occurData = new OccurData();
    private int type = 0, size = 1000;
    abstract void sort();
    abstract void swap(int a, int b);

    public int getType(){
        return type;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setType(int type){
        this.type = type;
    }

    public String execute(){
        long start = System.currentTimeMillis();
        sort();
        long end = System.currentTimeMillis();
        return Long.toString(end-start);
    }

    public int[] setArray(int size, int type, int[] arr){
        if(SortStrategy.RANDOM == type)
            occurData.RandomInitData(size);
        else if(SortStrategy.REVERSE == type)
            occurData.ReverseInitDat(size);
        arr = occurData.getter();
        return arr;
    }
}
