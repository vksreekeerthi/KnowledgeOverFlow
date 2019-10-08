package com.virtusa.KnowlegeOverFlow.Entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;
    private String answerDesc;
    private String votes;
    @CreationTimestamp
    @Column(nullable = false,updatable=false)
    private LocalDateTime created;
    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime lastUpdate;

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerDesc() {
        return answerDesc;
    }

    public void setAnswerDesc(String answerDesc) {
        this.answerDesc = answerDesc;
    }

    public String getVotes() {
        return votes;
    }

    public void setVotes(String votes) {
        this.votes = votes;
    }

    @ManyToOne(cascade=CascadeType.ALL)
    private Question question;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "answer", cascade=CascadeType.ALL)
    private Set<AnswerComment> answercomments;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", answerDesc='" + answerDesc + '\'' +
                ", votes='" + votes + '\'' +
                ", created=" + created +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
