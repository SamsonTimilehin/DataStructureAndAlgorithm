package recursion;

public class SquareOfANumber {

    public static void main(String[] args) {
        System.out.println(findSquare(3));
    }

    public static int findSquare(int number){

        int numVal = 0;



        for (int counter = 0; counter < number; counter++) {
            numVal = number + counter;
        }

        if(number == 0){
            return number;
        }
        return numVal + findSquare(number - 1);
    }


}
