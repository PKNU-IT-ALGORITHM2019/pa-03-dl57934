public class SortFactory {
    public SortStrategy makingSortMachine(String name){
        if(name.equals("Selection"))
            return new Selection();

        else if(name.equals("Quick1"))
            return new QuickSort1();

        else if(name.equals("Quick2"))
            return new QuickSort2();

        else if(name.equals("Quick3"))
            return new QuickSort3();

        else if(name.equals("Merge"))
            return new MergeSort();

        else if(name.equals("Bubble"))
            return new Bubble();

        else if(name.equals("Insertion"))
            return new Insertion();

        else if(name.equals("Heap"))
            return new Heap();

        else if(name.equals("CollectionsSort"))
            return new CollectionsSort();

        return null;
    }
}
