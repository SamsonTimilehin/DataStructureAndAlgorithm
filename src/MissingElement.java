import java.util.ArrayList;
import java.util.List;

public class MissingElement {

    public static void main(String[] args) {

        int[] arrayObj = {4,6,1,7,3,1,3};
        System.out.println(findMissingNumbers(arrayObj));
    }
    public static List<Integer> findMissingNumbers(int[] num){
        int positiveVal;
        List<Integer> addPositiveVal = new ArrayList<>();

        for(int i = 0; i < num.length; i++){

            positiveVal = Math.abs(num[i]) - 1;
            int val = num[positiveVal];
            if(val < 0){
                continue;
            }else {
                int negativeVal = val * -1;
                num[positiveVal] = negativeVal;
            }
        }
        for(int j = 0; j < num.length; j++){
            if(num[j] > 0){
                int missingElement = j + 1;
                addPositiveVal.add(missingElement);
            }
        }
        return addPositiveVal;
    }
}

