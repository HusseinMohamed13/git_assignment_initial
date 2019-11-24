package MathTopics;

import git_assignment_initial.ITopic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class SummationSeries implements ITopic {
	public static long GetSum(int n) {
		int result=0;
		for(int i=0;i<=n;i++)
		{
			result=result+i;
		}
		return result;
	}

	@Override
	public String NotifyTopic(int input) {

		long x= GetSum(input);
		String output = PrintStyle.print(input, "summation series") + x;
		return output;
	}
}
