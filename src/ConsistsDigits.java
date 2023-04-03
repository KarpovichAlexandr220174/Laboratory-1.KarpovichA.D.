import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
public class ConsistsDigits {
    //a recursive function for checking for "all digits"...
    public static Boolean StringChecking(String s) {
        //main conditions
        if (s.isEmpty()) {
            return true;
        }
        char element = s.charAt(0); //the first element checking
        if (!Character.isDigit(element)) {
            return false; //if the element is not a digit, with a symbol '!' in condition code, that means "not"
        }
        return StringChecking(s.substring(1)); //a recursive algorithm with
        //"substring" for cutting the string and checking for digits
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stroka = sc.next(); //getting a string from user
        System.out.println(StringChecking(stroka)); //using our recursive function with parameters by user
    }


}
