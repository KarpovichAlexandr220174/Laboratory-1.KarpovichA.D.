import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
public class Degree_IN {
    //a recursive function for finding (a^n)...
    public static int Degree_IN6TASK(int a, int n) {
        //important condition
        if (n == 0) {
            return 1;
        }
        return a * Degree_IN6TASK(a, n - 1); //a recursive algorithm of (a^n)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //getting values from user
        int n = sc.nextInt();
        System.out.println(Degree_IN6TASK(a, n)); //using our recursive function with parameters by user
    }


}
