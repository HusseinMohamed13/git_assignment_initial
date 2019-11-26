package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class Fibonacci implements ITopic {
	private int input;
    public Fibonacci(){
    	this.input=0;
    }
	public static long GetFib(int n) {
		long F[][] = new long[][]{{1,1},{1,0}};
 	    if (n == 0) {
 	        return 0;
 	    } 
 	    power(F, n-1);
		return F[0][0];
	    }
	public static void mult(long F[][], long M[][]) { 
		long x = F[0][0] * M[0][0] + F[0][1] * M[1][0]; 
        long y = F[0][0] * M[0][1] + F[0][1] * M[1][1]; 
        long z = F[1][0] * M[0][0] + F[1][1] * M[1][0]; 
        long w = F[1][0] * M[0][1] + F[1][1] * M[1][1]; 
  
        F[0][0] = x; 
        F[0][1] = y; 
        F[1][0] = z; 
        F[1][1] = w;  
	    } 
	 public static void power(long F[][], int n)  { 
	   if( n == 0 || n == 1) 
	      return; 
 		
 		long M[][] = new long[][]{{1,1},{1,0}}; 
	       
	    power(F, n/2); 
	    mult(F, F); 
	       
	    if (n%2 != 0) 
	       mult(F, M); 
	    } 
	@Override
	public String NotifyTopic(Topic topic) {
		this.input=topic.getInput();
		long ans = GetFib(this.input);
		String output = PrintStyle.print(this.input, "Fib") + ans;
		return output;
	}
}
