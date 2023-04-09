# Laboratory-1.KarpovichA.D.
Laboratory-1 tasks.
TASK 1 module src
Description: Return the minimum value of an array.

Explanation: This function recursively finds the minimum value in a given array of integers. It first checks the base case, which is when the size of the array is 1, and simply returns the first element of the array. Otherwise, it recursively calls itself with the size of the array reduced by 1, and takes the minimum value between the result of the recursive call and the last element of the array. This continues until the base case is reached, at which point the minimum value is returned.

Solution: 
public static int findMininum1TASK(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return Math.min(findMininum1TASK(arr, n - 1), arr[n - 1]); 
        }
    }
    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK 2 module src
Description: Return the average of an array.

Explanation: This function recursively finds the average value of a given array of integers. It first checks the base case, which is when the size of the array is 0, and simply returns 0. Otherwise, it recursively calls itself with the size of the array reduced by 1, and uses the formula (arr[n - 1] + (n - 1) * findAverage2TASK(arr, n - 1)) / n to calculate the average value. This formula adds the last element of the array to the product of the average value of the remaining array elements and their count, and then divides the result by the total count of array elements. This continues until the base case is reached, at which point the final average value is returned. 

Solution:
public static int findAverage2TASK(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n - 1] + (n - 1) * findAverage2TASK(arr, n - 1)) / n; 
        }
    }
    
----------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
TASK 3 module src
Description: Determine is given number prime or not.

Explanation: This function recursively checks whether a given integer is a prime number. It takes two input parameters, n which is the number to be checked, and helper which is used for checking if n is divisible by any number other than 1 and itself. The function uses a conditional statement to check the base case, which is when helper is less than or equal to 1, and simply returns true. If n is divisible by helper, it returns false since prime numbers should only be divisible by 1 and itself. Otherwise, it recursively calls itself with helper decremented by 1, continuing to check if n is divisible by any numbers before the square root of n. This continues until the base case is reached, at which point the final result of whether n is a prime number is returned.

Solution:     
public static Boolean getIsPrime3TASK(int n, int helper) {
        if (helper <= 1) {
            return true;
        } else if ((n % helper) == 0) {
            return false;
        } else {
            return getIsPrime3TASK(n, helper - 1); 
        }
    }
Attention!  
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(getIsPrime3TASK(n, (int) Math.sqrt(n))); 
    }
There must be n, and (int) Math.sqrt(n) as input parameters in "psvm".   
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK 4 module src
Description: Return "n!" of the given number.

Explanation: This function calculates the factorial of a given positive integer "n" using a recursive algorithm. The base case of the recursion is when n equals 1, and in that case, the function returns 1. Otherwise, the function multiplies n by the factorial of n-1, which is obtained by recursively calling the same function with the argument n-1.

Solution:   
public static int getfactorial4TASK(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getfactorial4TASK(n - 1); 
    }
  
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------  
TASK 5 module src
Description: Return the "n-th" element in Fibonacci sequence.

Explanation: This function calculates the nth number in the Fibonacci sequence using a recursive algorithm. The base cases of the recursion are when n equals 0 or 1, and in those cases, the function returns 0 or 1, respectively. Otherwise, the function recursively calculates the nth Fibonacci number by adding the previous two Fibonacci numbers, which are obtained by recursively calling the same function with the arguments n-1 and n-2.

Solution:  
public static int getFibonacci5TASK(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return getFibonacci5TASK(n - 1) + getFibonacci5TASK(n - 2); 
        }
    }
    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK 6 module src
Description: Return "a^n".

Explanation: This function calculates the value of a to the power of n (a^n) using a recursive algorithm. The base case of the recursion is when n equals 0, and in that case, the function returns 1. Otherwise, the function calculates a^n by multiplying a with a^(n-1), which is obtained by recursively calling the same function with the arguments a and n-1.

Solution:   
public static int getDegree_IN6TASK(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * getDegree_IN6TASK(a, n - 1); 
    }
    
----------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
TASK 7 module src
Description: Return given array in reverse order.

Explanation: This function recursively reverses the elements of an integer array "arr" of size "n" and returns a string representation of the reversed array. The base case of the recursion is when n equals 0, and in that case, the function returns an empty string. Otherwise, the function recursively reverses the array by appending the last element (arr[n-1]) to the result of recursively calling the same function with the arguments arr and n-1, separated by a space character.

Solution: 
public static String reverseArray7TASK(int[] arr, int n) {
        if (n == 0) {
            return "";
        } else {
            return arr[n - 1] + " " + reverseArray7TASK(arr, n - 1); 
        }
    }
    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
TASK 8 module src
Description: Check the string for "all digits".

Explanation: This function checks if a given string "s" contains only digits using a recursive algorithm. The base case of the recursion is when the string is empty, and in that case, the function returns true. Otherwise, the function checks if the first character of the string is a digit. If it's not, the function returns false. If it is a digit, the function recursively calls itself with the substring of the string starting from the second character, and continues the check with the rest of the string.

Solution:  
public static Boolean checkString8TASK(String s) {
        if (s.isEmpty()) {
            return true; 
        }
        char element = s.charAt(0); 
        if (!Character.isDigit(element)) {
            return false; 
        }
        return checkString8TASK(s.substring(1)); 
    }
    
----------------------------------------------------------------------------------------------------------------------------------------------------------------------- TASK 9 module src
Description: Return the value of Binomial Coefficient of given "n" and "k".

Explanation: This function calculates the binomial coefficient C(n,k) using a recursive algorithm. The base cases of the recursion are when k equals 0 or n, and in those cases, the function returns 1. Otherwise, the function recursively calculates C(n,k) by summing the binomial coefficients of C(n-1,k-1) and C(n-1,k), which are obtained by recursively calling the same function with the arguments n-1 and k-1 or k, respectively.

Solution:  
public static int findBinomial9TASK(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return findBinomial9TASK(n - 1, k - 1) + findBinomial9TASK(n - 1, k);
    }
    
----------------------------------------------------------------------------------------------------------------------------------------------------------------------- TASK 10 module src
Description: Return the GCD value of given "a" and "b".

Explanation: This function calculates the greatest common divisor (GCD) of two given integers "a" and "b" using the Euclidean algorithm with a recursive algorithm. The base case of the recursion is when b equals 0, and in that case, the function returns a. Otherwise, the function calculates the GCD of a and b by recursively calling the same function with the arguments b and a modulo b. The function repeats this step until the base case is reached, and the GCD is found.

Solution:   
public static int getGCD10TASK(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD10TASK(b, a % b); 
        }
    }

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    

    
