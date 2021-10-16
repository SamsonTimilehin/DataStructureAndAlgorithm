public class StringReverse {

    public static void main(String[] args) {

        System.out.println(reverseStringValue("method"));
    }
    public static String reverseStringValue(String originalValue){


        String reverseValue = "";

        for(int i = originalValue.length()-1; i >= 0; i--){
            reverseValue = reverseValue + originalValue.charAt(i);
        }
        return reverseValue;
    }
}
