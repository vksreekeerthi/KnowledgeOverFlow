package com.virtusa.KnowlegeOverFlow.Repository;

import com.virtusa.KnowlegeOverFlow.Entity.AnswerComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<AnswerComment,Integer> {
}
