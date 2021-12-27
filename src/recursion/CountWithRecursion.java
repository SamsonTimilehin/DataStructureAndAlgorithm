package recursion;

public class Count {

    public static void main(String[] args) {

        System.out.println(countZeros(200100));
    }

    public static int countZeros(int number){

        return helperMethod(number, 0);
    }

    private static int helperMethod(int number, int counter) {
        if(number == 0){
            return counter;
        }
        int reminder = number%10;
        if(reminder == 0){
            return helperMethod(number/10, counter + 1);
        }
        return helperMethod(number/10,counter);
    }
}
