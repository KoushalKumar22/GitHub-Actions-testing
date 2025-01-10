package com.example.GitHub_Actions_Testing.Controller;

import com.example.GitHub_Actions_Testing.Entity.TestingActions;
import com.example.GitHub_Actions_Testing.Repository.TARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TAController {
    @Autowired
    TARepository taRepository;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }
    @PostMapping("/save")
    public String save(@RequestBody TestingActions testingActions){
        taRepository.save(testingActions);
        return "Data Saved ";
    }
    @GetMapping("/all")
    public List<TestingActions> findAll(){
        return taRepository.findAll();
    }

}
