
import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {

        System.out.println(isPermutation("dog","goy"));

    }
    public static String sort(String string1){
        char[] content = string1.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public static boolean isPermutation(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }
        return sort(string1).equals(sort(string2));
    }
}
