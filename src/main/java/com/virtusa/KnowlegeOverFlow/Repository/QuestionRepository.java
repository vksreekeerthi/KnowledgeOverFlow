package com.virtusa.KnowlegeOverFlow.Repository;

import com.virtusa.KnowlegeOverFlow.Entity.Answer;
import com.virtusa.KnowlegeOverFlow.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
