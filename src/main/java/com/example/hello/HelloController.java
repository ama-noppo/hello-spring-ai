package com.example.hello;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new HelloResponse("Hello, " + name + "!");
    }

    @Data
    public static class HelloResponse {
        private final String message;

        public HelloResponse(String message) {
            this.message = message;
        }
    }
}
