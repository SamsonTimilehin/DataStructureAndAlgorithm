public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(findNthTerm(7));
    }
    public static int findNthTerm(int term){
        int firstTerm = 0;
        int secondTerm = 1;
        int count = 2;

        while(count <= term){
         int temp = secondTerm;
            secondTerm = secondTerm + firstTerm;
            firstTerm = temp;
            count++;
        }
        return secondTerm;
    }
}
