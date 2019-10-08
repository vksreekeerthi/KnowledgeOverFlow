package com.virtusa.KnowlegeOverFlow.Controller;

import com.virtusa.KnowlegeOverFlow.Entity.Question;
import com.virtusa.KnowlegeOverFlow.Entity.Tag;
import com.virtusa.KnowlegeOverFlow.Entity.User;
import com.virtusa.KnowlegeOverFlow.Model.PostQuestion;
import com.virtusa.KnowlegeOverFlow.Repository.QuestionRepository;
import com.virtusa.KnowlegeOverFlow.Service.QuestionService;
import com.virtusa.KnowlegeOverFlow.Service.TagService;
import com.virtusa.KnowlegeOverFlow.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@RestController
@RequestMapping("/knowledgeOverFlow/question")
public class QuestionController {
    @Autowired
    UserService userService;

    @Autowired
    QuestionService questionService;

    @Autowired
    TagService tagService;

    @PostMapping
    public Question postQuestion(@RequestBody PostQuestion postQuestion)
    {
        return questionService.saveQuestion(postQuestion);
    }
    @GetMapping
    public String getUserQuestions()
    {
        return questionService.questionsList().toString();
    }

    @GetMapping(value="all")
    public String getAllQuestions()
    {
        return questionService.questionsList().toString();
    }

}
