package com.virtusa.KnowlegeOverFlow.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Question {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    private String questionTitle;
    private String questionDesc;
    private static int votes;
    private String status;

    @CreationTimestamp
    @Column(nullable = false,updatable=false)
    private LocalDateTime created;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime lastUpdate;

    @OneToMany(mappedBy = "question", cascade=CascadeType.ALL)
    private Set<QuestionComment> questioncomments;

    @ManyToMany
    @JoinTable(
            name = "question_tag",
            joinColumns = { @JoinColumn(name = "questionId") },
            inverseJoinColumns = { @JoinColumn(name = "tagId") }
    )
    private Set<Tag> tags;

    @OneToMany(mappedBy = "question", cascade=CascadeType.ALL)
    private Set<Answer> answers;


    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Question() {
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
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
        questionDesc = questionDesc;
    }

    public static int getVotes() {
        return votes;
    }

    public static void setVotes(int votes) {
        Question.votes = votes;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<QuestionComment> getQuestioncomments() {
        return questioncomments;
    }

    public void setQuestioncomments(Set<QuestionComment> questioncomments) {
        this.questioncomments = questioncomments;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionTitle='" + questionTitle + '\'' +
                ", questionDesc='" + questionDesc + '\'' +
                ", created=" + created +
                ", lastUpdate=" + lastUpdate +
                ", tags=" + tags +
                ", answers=" + answers +
                ", user=" + user +
                '}';
    }
}
