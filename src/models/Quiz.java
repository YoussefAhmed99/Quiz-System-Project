package models;

import java.util.List;

public class Quiz {
    private int id;
    private String name;
    private List<Integer> questionsId;
    private String creator;

    public Quiz(int id, String name, List<Integer> questionsId, String creator) {
        this.id = id;
        this.name = name;
        this.questionsId = questionsId;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getQuestionsId() {
        return questionsId;
    }

    public void setQuestionsId(List<Integer> questionsId) {
        this.questionsId = questionsId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Quiz [id=" + id + ", name=" + name + ", questionsId=" + questionsId + ", creator=" + creator + "]";
    }

}
