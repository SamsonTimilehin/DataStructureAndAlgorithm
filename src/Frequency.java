public class Frequency {

    public static void main(String[] args) {

        System.out.println(displayFrequency(4591939,9));

    }
    public static int displayFrequency(int number, int selectedNumber){
        int count = 0;
       int remainder;

        while(number > 0){

            remainder = number % 10;
            number = number/10;

            if(remainder == selectedNumber){
                count++;
            }

        }
        return count;
    }
}
