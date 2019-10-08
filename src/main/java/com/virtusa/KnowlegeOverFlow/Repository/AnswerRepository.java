package com.virtusa.KnowlegeOverFlow.Repository;


import com.virtusa.KnowlegeOverFlow.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository  extends JpaRepository<Answer,Integer> {

}
