package recursion;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(findFibonacci(6));
    }

    public static int findFibonacci(int n){

        if(n < 2){
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}
