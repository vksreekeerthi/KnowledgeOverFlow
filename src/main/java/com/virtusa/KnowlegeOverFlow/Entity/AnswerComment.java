package com.virtusa.KnowlegeOverFlow.Entity;

import javax.persistence.*;

@Entity
public class AnswerComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerCommentId;
    private String answerCommentBody;

    @ManyToOne
    private Answer answer;

    public AnswerComment() {
    }
}
