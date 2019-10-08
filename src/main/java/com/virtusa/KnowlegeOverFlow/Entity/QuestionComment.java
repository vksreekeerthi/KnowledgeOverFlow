package com.virtusa.KnowlegeOverFlow.Entity;

import javax.persistence.*;

@Entity
public class QuestionComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionCommentId;
    private String questionCommentBody;

    @ManyToOne
    private Question question;
}
