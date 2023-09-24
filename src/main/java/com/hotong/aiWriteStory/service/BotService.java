package com.hotong.aiWriteStory.service;

import com.hotong.aiWriteStory.dto.BotRequest;
import com.hotong.aiWriteStory.dto.ChatGptResponse;

public interface BotService {

    ChatGptResponse askQuestion(BotRequest botRequest);
}
