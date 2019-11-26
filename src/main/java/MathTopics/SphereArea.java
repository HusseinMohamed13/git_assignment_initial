package MathTopics;

import git_assignment_initial.ITopic;
import git_assignment_initial.PrintStyle;
import git_assignment_initial.Topic;

//Please read CicleArea.java Code and implement as a clone of it but using your formula

public class SphereArea implements ITopic {
	private int input;
    public SphereArea(){
    	this.input=0;
    }
	public static double GetShpereArea(int r) {
		return (double) 4 * 22 / 7 * Math.pow(r, 2);
	}

	@Override
	public String NotifyTopic(Topic topic) {
        this.input=topic.getInput();
        double ans = GetShpereArea(input);
		String output = PrintStyle.print(this.input, "Sphere Area") + ans;
		return output;
	}

}
