package com.virtusa.KnowlegeOverFlow.Entity;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagId;
    private String tagName;


    @ManyToMany()
    @JoinTable(
            name = "question_tag",
            joinColumns = { @JoinColumn(name = "tagId") },
            inverseJoinColumns = { @JoinColumn(name = "questionId") }
    )
    private Set<Question> questions;

    @ManyToMany
    @JoinTable(
            name = "user_tag",
            joinColumns = { @JoinColumn(name = "tagId") },
            inverseJoinColumns = { @JoinColumn(name = "userId") }
    )
    private Set<User> user;
    public Tag() {
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagId=" + tagId +
                ", tagName='" + tagName + '\'' +

                '}';
    }
}
