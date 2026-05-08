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

            case "ADMISSION_INFORMATION":
                return """
                        Admission process:
                        1. Fill online application form
                        2. Submit required documents
                        3. Pay registration fees
                        4. Attend counseling process
                        """;

            default:
                return "Sorry, I didn't understand that.";
        }
    }
}
