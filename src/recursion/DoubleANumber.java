package recursion;

public class DoubleANumber {

    public static void main(String[] args) {

        System.out.println(doubleANumber(5));
    }
    public static int doubleANumber(int number){

        if(number == 0){
            return number;
        }
       return 2 + doubleANumber(number - 1);
    }


}
