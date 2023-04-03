import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
public class Reverse {
    //a recursive function for reversing an array...
    public static String reverseArray7TASK(int[] arr, int n) {
        //important condition
        if (n == 0) {
            return "";
        } else {
            return arr[n - 1] + " " + reverseArray7TASK(arr, n - 1); //a recursive algorithm for reversing an array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //filling an array by user
        }
        System.out.println(reverseArray7TASK(arr, n)); //using our recursive function with parameters by user
    }

}
