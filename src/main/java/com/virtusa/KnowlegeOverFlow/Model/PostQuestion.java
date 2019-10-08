package com.virtusa.KnowlegeOverFlow.Model;

public class PostQuestion {
    private String questionTitle;
    private String questionDesc;
    private int userId;

    public PostQuestion() {
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
