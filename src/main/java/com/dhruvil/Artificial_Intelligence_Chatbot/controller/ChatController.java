package com.dhruvil.Artificial_Intelligence_Chatbot.controller;

import com.dhruvil.Artificial_Intelligence_Chatbot.dto.ChatRequestDto;
import com.dhruvil.Artificial_Intelligence_Chatbot.dto.ChatResponseDto;
import com.dhruvil.Artificial_Intelligence_Chatbot.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
@RequiredArgsConstructor
public class ChatController {
    private final ChatService chatService;

    @PostMapping
    public ResponseEntity<ChatResponseDto> chat(@RequestBody ChatRequestDto req) {
        String reply = chatService.generateResponse(req.getMessage());

        return ResponseEntity.ok(new ChatResponseDto(reply));
    }
}
