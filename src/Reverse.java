public class Reverse {

    public static void main(String[] args) {

        System.out.println(displayReverseNumber(123456));
    }
    public static int displayReverseNumber(int number){
        int remainder;
        int answer = 0;
        while(number > 0){

         remainder = number % 10;
         number = number / 10;
         answer = answer * 10 + remainder;

        }
        return answer;
    }
}
