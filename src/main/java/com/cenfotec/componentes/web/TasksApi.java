package com.cenfotec.componentes.web;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins= "*")
public class TasksApi {

    @PostMapping
    public void task(@RequestBody String payload) {
    	System.out.println("Received task request: " + payload);
    }

}
