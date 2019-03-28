public class Main {
    //Random 0 REVERSE 1
    private static SortFactory sortFactory = new SortFactory();
    private static SortMachine sortMachine = new SortMachine();
    public static void main(String[] args){


         SortStrategy bubble= sortFactory.makingSortMachine("Bubble");
         SortStrategy selection = sortFactory.makingSortMachine("Selection");
         SortStrategy insertion = sortFactory.makingSortMachine("Insertion");
         SortStrategy quick1 = sortFactory.makingSortMachine("Quick1");
         SortStrategy quick2 = sortFactory.makingSortMachine("Quick2");
         SortStrategy quick3 = sortFactory.makingSortMachine("Quick3");
         SortStrategy merge = sortFactory.makingSortMachine("Merge");

         machineAppend(bubble);
         machineAppend(selection);
         machineAppend(insertion);
         machineAppend(quick1);
         machineAppend(quick2);
         machineAppend(quick3);
         machineAppend(merge);

         sortMachine.executeMachine();
         sortMachine.getResult();
    }
    public static void machineAppend(SortStrategy sort){
        sortMachine.appendSortList(sort);
    }
}
