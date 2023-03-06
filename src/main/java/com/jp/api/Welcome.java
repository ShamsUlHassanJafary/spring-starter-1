package com.jp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Welcome {

    @GetMapping
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        String response = "Hello, " + name;
        return response;
    }

}
