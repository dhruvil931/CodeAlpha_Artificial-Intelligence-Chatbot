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

            case "FEE_INFORMATION":
                return """
                        Fee details:
                        - Computer Engineering: ₹85,000/year
                        - IT Engineering: ₹80,000/year
                        - Mechanical Engineering: ₹75,000/year
                        - Hostel Fees: ₹40,000/year
                        """;

            case "TIMETABLE_INFORMATION":
                return """
                        College timings:
                        - Monday to Friday: 9:00 AM to 4:00 PM
                        - Saturday: 9:00 AM to 1:00 PM
                        - Lunch Break: 12:30 PM to 1:15 PM
                        """;

            default:
                return "Sorry, I didn't understand that.";
        }
    }
}
