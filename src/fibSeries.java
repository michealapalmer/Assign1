/*Micheala Palmer
 * Feb 6, 2018
 */
import java.util.Scanner;
	public class fibSeries {
		// TODO Auto-generated constructor stub
		public static void main(String args[]) {
	 
			// input to print Fibonacci series upto how many numbers
			log("Enter number upto which Fibonacci series to print: ");//calling log function (console print)
			int number = new Scanner(System.in).nextInt();
			log("\nUsing Method-1: Using Recursion. Provided Number: " + number);//console print
			// printing Fibonacci series upto number
			double start = System.nanoTime();//start timing execution of following function
			for (int i = 1; i <= number; i++) {
				log(fibSeriesRec(i) + " "); //printing all numbers in series
			}
			double end = System.nanoTime();//end timing execution for the function above
			//execution time is the difference between end and start.
			double elapsed = end - start;
			System.out.println("Elapsed time in nanoseconds is: " + elapsed);
	        //converting time elapsed from nanoseconds to milliseconds
	        System.out.println("Elapsed time in milliseconds is: " + elapsed/1000000);
	        
	        double startTime = System.nanoTime();//start timing execution of following function
			log("\nMethod-2: Using Iteration. Fibonacci number at location " + number + " is ==> " + (fibSeriesIte(number) + ""));
			//execution time is the difference between end and start.
			double endTime = System.nanoTime();//stop timing execution of function above
			double elapsedTime = endTime - startTime;
			System.out.println("Elapsed time in nanoseconds is: " + elapsedTime);
	        //converting time elapsed from nanoseconds to milliseconds
	        System.out.println("Elapsed time in milliseconds is: " + elapsedTime/1000000);
		}
	 
		// Method-1: Java program for Fibonacci number using recursion.
		public static int fibSeriesRec(int number) {
			if (number == 1 || number == 2) {
				return 1;
			}
	 
			return fibSeriesRec(number - 1) + fibSeriesRec(number - 2); // tail recursion
		}
	 
		// Method-2: Java program for Fibonacci number using Iteration (Loop).
		public static int fibSeriesIte(int number) {
			if (number == 1 || number == 2) {
				return 1;
			}
			int fibo1 = 1, fibo2 = 1, fibonacci = 1;
			for (int i = 3; i <= number; i++) {
				fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
				fibo1 = fibo2;
				fibo2 = fibonacci;
	 
			}
			return fibonacci; // Fibonacci number
		}
	 
		private static void log(String number) { //private method only accessible by main
			System.out.println(number);
	 
		}
	 
	}//example from http://crunchify.com/write-java-program-to-print-fibonacci-series-upto-n-number/

	