package com.virtusa.KnowlegeOverFlow.Controller;

import com.virtusa.KnowlegeOverFlow.Entity.Question;
import com.virtusa.KnowlegeOverFlow.Entity.Tag;
import com.virtusa.KnowlegeOverFlow.Service.QuestionService;
import com.virtusa.KnowlegeOverFlow.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/knowledgeOverFlow/tag")
public class TagController {
    @Autowired
    QuestionService questionService;

    @Autowired
    TagService tagService;

    @PostMapping(value="{qid}")
    public void tagQuestion(@PathVariable int qid, @RequestBody Set<Tag> tag)
    {
        Question question=questionService.getOne(qid);
        Set<Question> questions=new HashSet<>();
        questions.add(question);
        for (Tag temp : tag)
        {
            System.out.println(temp);
            temp.setQuestions(questions);
            tagService.saveTag(temp);
        }
        question.setTags(tag);
    }
}
