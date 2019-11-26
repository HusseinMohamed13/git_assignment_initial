package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class LucasSeries implements ITopic {
	private int input;
    public LucasSeries(){
    	this.input=0;
    }
	public static long GetLucas(int n) {
		if (n == 0)
			return 2;
		if (n == 1)
			return 1;

		// recurrence relation
		return GetLucas(n - 1) + GetLucas(n - 2);
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
        long ans = GetLucas(this.input);
		String output = PrintStyle.print(this.input, "Lucas") + ans;
		return output;
	}
}
