package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class SummationSeries implements ITopic {
	private int input;
    public SummationSeries(){
    	this.input=0;
    }
	public static long GetSum(int n) {
		int result=0;
		for(int i=0;i<=n;i++)
		{
			result=result+i;
		}
		return result;
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
		long x= GetSum(input);
		String output = PrintStyle.print(this.input, "Sum") + x;
		return output;
	}
}
