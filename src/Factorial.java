import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
public class Factorial {
    //a recursive function for finding factorial...
    private static int factorial4TASK(int n) {
        //important condition
        if (n == 1) {
            return 1;
        }
        return n * factorial4TASK(n - 1); //recursive algorithm of factorial
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //getting a value from user
        System.out.println(factorial4TASK(n)); //using our recursive function with parameters by user
    }

}
