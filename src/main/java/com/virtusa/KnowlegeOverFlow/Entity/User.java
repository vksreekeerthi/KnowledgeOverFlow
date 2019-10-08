package com.virtusa.KnowlegeOverFlow.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class User {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String email;
    private String password;
    private String description;
    @JsonIgnore
    private boolean isActive;


    @CreationTimestamp
    @Column(nullable = false,updatable=false)
    private LocalDateTime created;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime lastUpdate;
    @ManyToMany
    @JoinTable(
            name = "user_tag",
            joinColumns = { @JoinColumn(name = "userId") },
            inverseJoinColumns = { @JoinColumn(name = "tagId") }
    )
    private Set<Tag> tags;


    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
    private Set<Question> questions;

    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
    private Set<Answer> Answer;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Set<com.virtusa.KnowlegeOverFlow.Entity.Answer> getAnswer() {
        return Answer;
    }

    public void setAnswer(Set<com.virtusa.KnowlegeOverFlow.Entity.Answer> answer) {
        Answer = answer;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                ", lastUpdate=" + lastUpdate +
                ", tags=" + tags +
                '}';
    }
}
