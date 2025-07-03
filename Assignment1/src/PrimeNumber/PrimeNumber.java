package PrimeNumber;
import java.util.*;

public class PrimeNumber {

	 public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        
	        if (number == 2) {
	            return true;
	        }
	        
	        if (number % 2 == 0) {
	            return false;
	        }

	        for (int i = 3; i * i <= number; i += 2) {
	        	
	            if (number % i == 0) {
	                return false; 
	            }
	        }
	        return true; 
	    }

	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter a number:");
	       int num = sc.nextInt();
	        System.out.println(num + " is prime: " + isPrime(num)); 
	    }
}
