import java.util.ArrayList;
import java.util.Iterator;

public class SortMachine{
    private final int EVEN = 0, ODD = 1;
    private final int FINAL_INDEX = 5;
    private final int RANDOM = 0, REVERSE = 1;
    private final int CHANGE_SIZE_10000 = 2, CHANGE_SIZE_100000 = 4;
    private ArrayList<SortStrategy> sortList = new ArrayList<SortStrategy>();
    private StringBuilder resultBuilder = new StringBuilder();
    public void appendSortList(SortStrategy sortMachine){
        sortList.add(sortMachine);
    }

    public void executeMachine(){
        Iterator it = sortList.iterator();
        while(it.hasNext()){
            SortStrategy sortStrategy = (SortStrategy)it.next();
            for(int i = 0; i < 6; i++){
                if(i%2==EVEN) {
                    sortStrategy.setType(RANDOM);
                    if(i == CHANGE_SIZE_10000)
                        sortStrategy.setSize(10000);
                    if(i == CHANGE_SIZE_100000)
                        sortStrategy.setSize(100000);
                }if(i%2==ODD)
                    sortStrategy.setType(REVERSE);
                resultBuilder.append(sortStrategy.execute()+" ");
                if(i == FINAL_INDEX)
                    resultBuilder.append("\n");
            }
        }
    }

    public void getResult(){
        System.out.println(resultBuilder.toString());
    }


}
