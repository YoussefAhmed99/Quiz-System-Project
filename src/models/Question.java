package models;

import java.util.List;

public class Question {
    private int id;
    private String topic;
    private String subTopic;
    private String text;
    private List<String> options;
    private String correctAnswer;
    private String creator;

    public Question(int id, String topic, String subTopic, String text, List<String> options, String correctAnswer,
            String creator) {
        this.id = id;
        this.topic = topic;
        this.subTopic = subTopic;
        this.text = text;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", topic=" + topic + ", subTopic=" + subTopic + ", text=" + text + ", options="
                + options + ", correctAnswer=" + correctAnswer + ", creator=" + creator + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubTopic() {
        return subTopic;
    }

    public void setSubTopic(String subTopic) {
        this.subTopic = subTopic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

}
