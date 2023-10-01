package com.hotong.aiWriteStory.controller;

import com.hotong.aiWriteStory.dto.BotRequest;
import com.hotong.aiWriteStory.dto.ChatGptResponse;
import com.hotong.aiWriteStory.service.BotService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") // 허용할 도메인을 지정합니다.
public class BotController {

    private final BotService botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody BotRequest botRequest) {
        return botService.askQuestion(botRequest);
    }

    @GetMapping("/hello")
    //@CrossOrigin(origins = {"http://localhost:19000","http://172.30.1.31:8081"}) // 허용할 도메인을 지정합니다.
    @CrossOrigin(origins = "*") // 허용할 도메인을 지정합니다.
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("드디어 통신됫다!!!!!!!!!!!!!!");
    }
}



