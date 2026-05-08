package com.dhruvil.Artificial_Intelligence_Chatbot.service;

import com.dhruvil.Artificial_Intelligence_Chatbot.nlp.IntentClassifier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final IntentClassifier intentClassifier;

    public String generateResponse(String input) {
        String intent = intentClassifier.classifyIntent(input);

        switch (intent) {
            case "GREETING":
                return "Hello! How can I assist you today?";

            case "COURSE_INFORMATION":
                return """
                        Our college offers courses in:
                        - Computer Engineering
                        - Information Technology
                        - Mechanical Engineering
                        - Civil Engineering
                        - Electrical Engineering
                        """;

            default:
                return "Sorry, I didn't understand that.";
        }
    }
}
