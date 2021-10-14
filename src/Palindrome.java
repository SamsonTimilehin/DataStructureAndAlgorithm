

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("theyeht"));
    }
    public static boolean isPalindrome(String stringValue){
        stringValue = stringValue.toLowerCase();
         if(stringValue.length() == 0){
             return true;
         }

        for(int i = 0; i < stringValue.length()/2; i++){

            char start = stringValue.charAt(i);
            char end = stringValue.charAt(stringValue.length()-1-i);

            if(start != end){
                return false;
            }

        }
        return true;
    }
}
