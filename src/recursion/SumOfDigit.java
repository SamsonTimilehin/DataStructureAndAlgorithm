package recursion;

public class SumOfDigit {

    public static void main(String[] args) {
        System.out.println(findSumOfDigits(2345));
    }

    public static int findSumOfDigits(int n){
        if(n == 0){
            return n;
        }
        return n%10 + findSumOfDigits(n/10);
    }
}
