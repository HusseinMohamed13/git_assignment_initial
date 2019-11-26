package MathTopics;

import git_assignment_initial.*;

public class CircleArea implements ITopic {
	private int input;
    public CircleArea(){
    	this.input=0;
    }
	public static double GetCircleArea(int r) {
		return (double)(22 * r * r) / 7;
	}

	@Override
	public String NotifyTopic(Topic topic) {
		this.input=topic.getInput();
		double ans = GetCircleArea(this.input);
		String output = PrintStyle.print(this.input, "Circle Area") + ans;
		return output;
	}
}
