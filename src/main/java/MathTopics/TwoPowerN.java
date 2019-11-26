package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class TwoPowerN implements ITopic {
	private int input;
    public TwoPowerN(){
    	this.input=0;
    }
	public static long Get2PN(int n) {
		if(n==0) {
			return 1;
		}
		 return (long)(2)*(Get2PN(n-1));
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
        long ans = Get2PN(input);
	    String output = PrintStyle.print(this.input, "2PN") + ans;
	    return output;
	}
}
