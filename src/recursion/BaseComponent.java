package recursion;

public class BaseComponent {

    public static void main(String[] args) {

        System.out.println(findResult(3,3));
    }
    public static int findResult(int base, int component){
        if(component == 0){
            return 1;
        }
        return base * findResult(base, component - 1);
    }
}
