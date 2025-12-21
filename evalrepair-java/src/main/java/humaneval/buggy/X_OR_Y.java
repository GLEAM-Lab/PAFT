package humaneval.buggy;

/* A simple program which should return the value of x if n is 
a prime number and should return the value of y otherwise.

Examples:
for x_or_y(7, 34, 12) == 34
for x_or_y(15, 8, 5) == 5 */

public class X_OR_Y {
    public static boolean checkPrime(int n){
         if (n <= 1)
            return false;
    
        // Check from 2 to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
     
        return true;
    }

    public static int x_or_y(int n, int x, int y) {

        if (!checkPrime(n)){
            return x;
        } else {
            return y;
        }

        
       
       
    }
}