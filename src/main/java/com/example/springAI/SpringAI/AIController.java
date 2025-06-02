package com.example.springAI.SpringAI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

    @Autowired
    private  AIService aiService;

    @GetMapping("/prompt")
    public String prompt(@RequestParam String message){
        return aiService.chat(message);
    }
}
