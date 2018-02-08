import java.util.*; 


public class fibonacci {
	public fibonacci() {
		// TODO Auto-generated constructor stub
		//testing will be done through run configurations tab in main
		
	}
	 
	public static int[] fiboSeriesRec(int userInput){
		int[] arrayOfSeq = new int[userInput]; //array size is the size of the number entered (nth)
		return fibonacciSeqHelper(arrayOfSeq, 0, userInput);
		
	}//exponential time algorithm
	
	public static int[] fibonacciSeqHelper(int[] numArray, int currentTerm, int nthTerm){
		if(nthTerm + 1 == currentTerm) {
		    return numArray; 
		}
		else if(nthTerm == currentTerm) {
		    return numArray;
		}
		//terms are initialized to first two terms of the Fibonacci series 0 and 1 respectively.
		else if (currentTerm == 0) {
		  numArray[currentTerm] = 0; //pushing integers onto stack
		  return fibonacciSeqHelper(numArray, currentTerm+1, nthTerm);
		}
		else if (currentTerm ==1){
			numArray[currentTerm] =1;
			return fibonacciSeqHelper(numArray, currentTerm+1, nthTerm);			
		}
		else {
		  numArray[currentTerm] = numArray[currentTerm-2] + numArray[currentTerm-1];
		//the current spot in array is equal to the sum of previous two spots
		  return fibonacciSeqHelper(numArray, currentTerm+1, nthTerm);
		  //recursive needs a helper function to pass the parameters
		}
	}
	
	//linear algorithm 
	public static int[] fibSeriesIte(int userInput){
		int[] arrayOfSeq = new int[userInput];
		// iterates to i (number of terms) displaying the sum of previous two terms stored in variable 
		//arrayOfSeq[i]
		for(int i = 0; i < arrayOfSeq.length; i++){
			//terms are initialized to first two terms of the Fibonacci series 0 and 1 respectively
			if (i == 0) {
				arrayOfSeq[i] = 0;
				continue;
			}
			else if (i==1){
				arrayOfSeq[i] = 1;
				continue;
			}
			arrayOfSeq[i] = arrayOfSeq[i-2] + arrayOfSeq[i-1]; 
			//the current spot in array is equal to the sum of previous two spots
		}
		
		return arrayOfSeq;
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//used run configurations to test 	
		System.out.println("RECURSIVE:\n");
		double startTime = System.nanoTime();//start timing execution of following function
		int[] fibArray = fiboSeriesRec(Integer.valueOf(args[0]));		
		for(int i = 0; i < fibArray.length; i++)
			System.out.println(fibArray[i]);		
		double endTime = System.nanoTime();//stop timing execution of function above
		//execution time is the difference between endTIme and startTime.
		double elapsedTime = endTime - startTime;
		System.out.println("Elapsed time in nanoseconds is: " + elapsedTime);
        //converting time elapsed from nanoseconds to milliseconds	
        System.out.println("Elapsed time in milliseconds is: " + elapsedTime/1000000);
		
		//iterative method
        
        System.out.println("\n\nITERATIVE:\n");
        double start = System.nanoTime();//start timing execution of following function
		int[] fibItArray = fibSeriesIte(Integer.valueOf(args[0]));		
		for(int i = 0; i < fibItArray.length; i++)
			System.out.println(fibItArray[i]);
		double end = System.nanoTime();//end timing execution for the function above
		//execution time is the difference between end and start.
		double elapsed = end - start;
		System.out.println("Elapsed time in nanoseconds is: " + elapsed);
        //converting time elapsed from nanoseconds to milliseconds
        System.out.println("Elapsed time in milliseconds is: " + elapsed/1000000);
	}

}
