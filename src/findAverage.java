import java.util.Scanner;

//Karpovich A.D. SE-2218 220174
/*
    @ findAverage2TASK - definition of average
    @ n - length of array
    @ arr - array
    @ return - returning the average of array
*/
public class findAverage {
    //a recursive function for finding average of array...
    public static int findAverage2TASK(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n - 1] + (n - 1) * findAverage2TASK(arr, n - 1)) / n; //main recursive algorithm
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //array filling by user
        }
        System.out.println(findAverage2TASK(arr, n)); //using our recursive function with parameters by user
    }

}
