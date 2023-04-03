import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
public class Binomial {
    //a recursive function for finding Binomial Coeff...
    public static int binomialCoefficient(int n, int k) {
        //important condition from task
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k); //a recursive
        //algorithm for finding binomial coefficient
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //getting values from user
        int k = sc.nextInt();
        System.out.println(binomialCoefficient(n, k)); //using our recursive function with parameters by user
    }

}
