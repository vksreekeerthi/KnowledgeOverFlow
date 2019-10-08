package com.virtusa.KnowlegeOverFlow.Service;

import com.virtusa.KnowlegeOverFlow.Entity.Question;
import com.virtusa.KnowlegeOverFlow.Model.PostQuestion;

import java.util.List;

public interface QuestionService {
    public List<Question> questionsList();
    public Question question(int qid);
    public Question saveQuestion(PostQuestion postQuestion);

   public Question getOne(int qid);
}
