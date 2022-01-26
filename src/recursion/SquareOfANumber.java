package recursion;

public class SquareOfANumber {

    public static void main(String[] args) {
        System.out.println(findSquare(-9));
    }

    public static int findSquare(int number){

        return helperMethod(number, 1);
    }

    private static int helperMethod(int number, int result) {
        if(result > 1){
            return result;
        }

        return helperMethod(number, result * (number * number));
    }
}
