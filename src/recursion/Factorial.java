package recursion;

public class Factorial {

    public static void main(String[] args) {
        int returnVal = findFactorial(4);
        System.out.println(returnVal);

    }
    public static int findFactorial(int number){
        if(number == 0){
            return 1;
        }
        return number * findFactorial(number - 1);
    }
}
