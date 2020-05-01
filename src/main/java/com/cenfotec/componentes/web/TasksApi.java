package com.cenfotec.componentes.web;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins= "*")
public class TasksApi {

    @GetMapping
    public String task() {
    	System.out.println("Received task request: ");
    	return "Sirvió!";
    }

}
