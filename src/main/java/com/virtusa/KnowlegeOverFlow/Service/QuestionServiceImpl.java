package com.virtusa.KnowlegeOverFlow.Service;

import com.virtusa.KnowlegeOverFlow.Entity.Question;
import com.virtusa.KnowlegeOverFlow.Model.PostQuestion;
import com.virtusa.KnowlegeOverFlow.Repository.QuestionRepository;
import com.virtusa.KnowlegeOverFlow.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    UserRepository userRepository;
    @Override
    public List<Question> questionsList() {
        return questionRepository.findAll();
    }

    @Override
    public Question question(int qid) {
        return questionRepository.getOne(qid);
    }

    @Override
    public Question saveQuestion(PostQuestion postQuestion) {
        Question question=new Question();
        question.setQuestionTitle(postQuestion.getQuestionTitle());
        question.setQuestionDesc(postQuestion.getQuestionDesc());
        question.setUser(userRepository.getOne(postQuestion.getUserId()));
        question.setStatus("Active");
        questionRepository.save(question);
        return question;
    }


    @Override
    public Question getOne(int qid) {
        return questionRepository.getOne(qid);
    }
}
