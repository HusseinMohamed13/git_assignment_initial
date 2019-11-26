package MathTopics;

import git_assignment_initial.*;


public class CircleVolume implements ITopic {
	private int input;
    public CircleVolume(){
    	this.input=0;
    }
	public static double GetCircleVolume(int r) {
		return (double) (22 * 4 * r * r * r) / (7 * 3);
	}

	@Override
	public String NotifyTopic(Topic topic) {
		this.input=topic.getInput();
		double ans = GetCircleVolume(this.input);
		String output = PrintStyle.print(this.input, "Circle Volume") + ans;
		return output;
	}
}

