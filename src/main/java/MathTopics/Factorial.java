package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class Factorial implements ITopic {
	private int input;
    public Factorial(){
    	this.input=0;
    }
	public static long GetFactorial(int n) {
		 if (n == 0) {
	           return 1;
	       } else {
	           return n * GetFactorial(n - 1);
	       }
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
        long ans = GetFactorial(this.input);
        String output = PrintStyle.print(this.input, "Factorial") + ans;
        return output;
	}
}
