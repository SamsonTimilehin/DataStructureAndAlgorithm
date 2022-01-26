package recursion;

public class DoubleANumber {

    public static void main(String[] args) {

        System.out.println(doubleANumber(3));
    }
    public static int doubleANumber(int number){

       return helperMethod(number, 2);
    }

    private static int helperMethod(int number, int val) {
        if(val > 2){
            return val;
        }
       return helperMethod(number, val * number);
    }
}
