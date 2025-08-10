package com.example.hello;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AiController {

    private final ChatClient chat;

    public AiController(ChatModel model) {
        this.chat = ChatClient.builder(model).build();
    }

    @GetMapping("/ai/complete")
    public String complete(@RequestParam(defaultValue = "JavaでHello Worldを出力するコードを書いて") String prompt) {
        return chat.prompt().user(prompt).call().content();
    }
}
