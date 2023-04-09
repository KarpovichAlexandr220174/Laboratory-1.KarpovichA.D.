import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
/*
    @ getFibonacci5TASK - definition of Fibonacci
    @ n - number
    @ return - returning a value of Fibonacci
*/
public class Fibonacci {
    //a recursive function for finding Fibonacci
    public static int getFibonacci5TASK(int n) {
        //main conditions
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci5TASK(n - 1) + getFibonacci5TASK(n - 2); //a recursive algorithm of Fibonacci
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //getting a value from user
        System.out.println(getFibonacci5TASK(n)); //using our recursive function with parameters by user
    }

}
