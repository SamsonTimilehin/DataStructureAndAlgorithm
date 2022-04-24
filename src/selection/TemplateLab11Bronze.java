package selection;

import java.util.*;

public class TemplateLab11Bronze {

    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>(List.of(27,44,22,20,41,29,10,2,33,7,16,26,13,44,15,15,23,11,42,13));
        printInOrder(val);
    }

    private static void printInOrder(ArrayList<Integer> data){
        for (int i = 0; i < data.size(); i++) {
            int last = data.size() - i - 1;
            int maxIndex = getMaxIndex(data, 0, last);
            swap(data,maxIndex,last);

        }
        System.out.println("Print the List in ascending order\n" + data);
        Iterator<Integer> iterate = data.iterator();
        while (iterate.hasNext()){
            iterate.next();
            iterate.remove();
        }
        System.out.print("Empty List\n" + data);
    }

    private static void swap(ArrayList<Integer> data, int first, int second){
        Collections.swap(data,first,second);
    }
    private static int getMaxIndex(ArrayList<Integer> data, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
           if(data.get(max) < data.get(i)){
               max = i;
           }
        }
        return max;
    }
}
