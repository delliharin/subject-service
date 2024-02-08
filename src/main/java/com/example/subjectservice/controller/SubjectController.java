package com.example.subjectservice.controller;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @GetMapping("/records")
    public JSONObject test() {
        JSONObject obj=new JSONObject();
        obj.put("code","Math");
        obj.put("name","Mathematics");
        obj.put("subjectId",new Integer(101));
        System.out.println("Subject Service Invoked...");
        return obj;
    }
}