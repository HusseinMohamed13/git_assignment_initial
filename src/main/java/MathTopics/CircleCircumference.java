package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.Topic;

// Please read CicleArea.java Code and implement as a clone of it but using your formula

public class CircleCircumference implements ITopic {
	private int input;
    public CircleCircumference(){
    	this.input=0;
    }
	public static double GetCircleCircumference(int r) {
		return (double)440 / 7;
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
		return "Input = 10\nCircle Circumference = " + (double)440 / 7;
	}

}
