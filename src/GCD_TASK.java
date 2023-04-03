import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
public class GCD_TASK {
    //a recursive function for finding GCD of two numbers...
    public static int GCD10TASK(int a, int b) {
        //important condition
        if (b == 0) {
            return a;
        } else {
            return GCD10TASK(b, a % b); //a recursive algorithm for finding GCD (Euclidean Algorithm)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //getting values from user
        int k = sc.nextInt();
        System.out.println(GCD10TASK(n, k)); //using our recursive function with parameters by user
    }

}
