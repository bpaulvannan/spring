package bpv.example.springboot.crud.service;

import bpv.example.springboot.crud.entity.Question;
import bpv.example.springboot.crud.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionManagerService {

    @Autowired
    private QuestionRepo questionRepo;

    public Question save(Question question){
        return questionRepo.save(question);
    }

    public List<Question> getQuestions(String category){
        return questionRepo.findByCategory(category.toUpperCase());
    }
}
