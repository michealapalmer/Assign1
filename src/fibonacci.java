
public class fibonacci {
	public fibonacci() {
		// TODO Auto-generated constructor stub
		//testing will be done through run configurations tab in main
		
	}
	public static int[] fibonacciSeq(int userInput){
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
		else if (currentTerm == 0) {
		  numArray[currentTerm] = 0;//
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
	
	public static int[] fibIterative(int userInput){
		int[] arrayOfSeq = new int[userInput];
		for(int i = 0; i < arrayOfSeq.length; i++){
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
		long startTime = System.currentTimeMillis();    
		long endTime = System.currentTimeMillis();
		long elapsedTime = endTime - startTime;
		
		System.out.println("RECURSIVE:\n");
		int[] fibArray = fibonacciSeq(Integer.valueOf(args[0]));

		for(int i = 0; i < fibArray.length; i++)
			System.out.println(fibArray[i]);
		
        System.out.println("Elapsed time in milliseconds is: " + elapsedTime);
		
		System.out.println("\n\nITERATIVE:\n");
		int[] fibItArray = fibIterative(Integer.valueOf(args[0]));
		
		for(int i = 0; i < fibItArray.length; i++)
			System.out.println(fibItArray[i]);
	
        System.out.println("Elapsed time in milliseconds is: " + elapsedTime);
	}

}
