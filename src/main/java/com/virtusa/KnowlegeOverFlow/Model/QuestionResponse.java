package com.virtusa.KnowlegeOverFlow.Model;

import com.virtusa.KnowlegeOverFlow.Entity.Answer;
import com.virtusa.KnowlegeOverFlow.Entity.Tag;

import java.util.Set;

public class QuestionResponse {
    String title;
    String desc;
    String username;
    Set<Answer> answers;
    Set<Tag> tags;

    public QuestionResponse() {
    }

    @Override
    public String toString() {
        return "QuestionResponse{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", username='" + username + '\'' +
                ", answers=" + answers +
                ", tags=" + tags +
                '}';
    }
}
