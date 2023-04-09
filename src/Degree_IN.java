import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
/*
    @ getDegree_IN6TASK - definition of number in degree
    @ a - number
    @ n - degree
    @ return - returning a value of "a^n"
*/
public class Degree_IN {
    //a recursive function for finding (a^n)...
    public static int getDegree_IN6TASK(int a, int n) {
        //important condition
        if (n == 0) {
            return 1;
        }
        return a * getDegree_IN6TASK(a, n - 1); //a recursive algorithm of (a^n)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //getting values from user
        int n = sc.nextInt();
        System.out.println(getDegree_IN6TASK(a, n)); //using our recursive function with parameters by user
    }


}
