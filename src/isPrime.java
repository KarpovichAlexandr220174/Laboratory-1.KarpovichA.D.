import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
/*
    @ getIsPrime3TASK - definition of prime
    @ n - number
    @ helper - assistant for determine "isprime" or not
    @ return - returning "isprime" or not
*/
public class isPrime {
    //a recursive function for finding average of array...
    public static Boolean getIsPrime3TASK(int n, int helper) {
        //we need "int helper" for checking dividing by it, with a condition,
        // that prime numbers must divide only by 1 and itself
        //-------------------------------------------
        //main conditions
        if (helper <= 1) {
            return true;
        } else if ((n % helper) == 0) {
            return false;
        } else {
            return getIsPrime3TASK(n, helper - 1); //main recursive algorithm for checking dividing
            //by all elements before Math.sqrt(n) inclusive...
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //getting a value from user
        System.out.println(getIsPrime3TASK(n, (int) Math.sqrt(n))); //using our recursive function with parameters by user
    }

}
