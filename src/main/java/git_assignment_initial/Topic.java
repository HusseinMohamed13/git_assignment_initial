package git_assignment_initial;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	private List<ITopic> TopicList;
    private int input;
	public Topic() {
		this.input=0;
		this.TopicList = new ArrayList<ITopic>();
	}
    public void SetInput(int input) {
    	this.input=input;
    }
    public int getInput() {
    	return this.input;
    }
	public void AddTopic(ITopic topic) {
		this.TopicList.add(topic);
	}

	public List<ITopic> GetTopics() {
		return this.TopicList;
	}

	public String DoEvent(int input) {
		this.SetInput(input);
		String[] output = new String[TopicList.size()];
		int i = 0;
		for (ITopic topic : TopicList) {
			output[i] = topic.NotifyTopic(this);
			i++;
		}

		String res = new String();
		for (String str : output) {
			res += str + "\n";
		}

		return res;
	}
}
