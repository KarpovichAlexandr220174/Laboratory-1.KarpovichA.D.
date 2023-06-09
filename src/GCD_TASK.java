import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
/*
    @ getGCD10TASK - definition of GCD
    @ a - number
    @ b - number
    @ return - returning a value of GCD
*/
public class GCD_TASK {
    //a recursive function for finding GCD of two numbers...
    public static int getGCD10TASK(int a, int b) {
        //important condition
        if (b == 0) {
            return a;
        } else {
            return getGCD10TASK(b, a % b); //a recursive algorithm for finding GCD (Euclidean Algorithm)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //getting values from user
        int k = sc.nextInt();
        System.out.println(getGCD10TASK(n, k)); //using our recursive function with parameters by user
    }

}
