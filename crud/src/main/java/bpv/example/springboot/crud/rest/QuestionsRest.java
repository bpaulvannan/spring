package bpv.example.springboot.crud.rest;

import bpv.example.springboot.crud.entity.Question;
import bpv.example.springboot.crud.service.QuestionManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import java.util.List;
@RestController
@RequestMapping("/questions")
public class QuestionsRest {

    @Autowired
    private QuestionManagerService questionManagerService;

    @PermitAll
    @RequestMapping("/{category}")
    @GetMapping
    public List<Question> getQuestions(@PathVariable String category){
        return questionManagerService.getQuestions(category);
    }
}
