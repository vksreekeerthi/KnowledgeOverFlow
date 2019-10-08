package com.virtusa.KnowlegeOverFlow.Controller;

import com.virtusa.KnowlegeOverFlow.Entity.Answer;
import com.virtusa.KnowlegeOverFlow.Entity.Question;
import com.virtusa.KnowlegeOverFlow.Entity.User;
import com.virtusa.KnowlegeOverFlow.Repository.AnswerRepository;
import com.virtusa.KnowlegeOverFlow.Service.QuestionService;
import com.virtusa.KnowlegeOverFlow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/knowledgeOverFlow/answer")
public class AnswerController {
    @Autowired
    QuestionService questionService;

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    UserService userService;

    @PostMapping("{qid}/{uid}")
    public void addQuestion(@PathVariable int qid, @PathVariable int uid, @RequestBody Answer answer)
    {
        User user=userService.getOne(uid);
        Question question=questionService.getOne(qid);
        Set<Answer> answers=new HashSet<>();
            System.out.println(answer);
            answer.setQuestion(question);
            answer.setUser(user);
            answerRepository.save(answer);
        user.setAnswer(answers);
        question.setAnswers(answers);
    }

}
