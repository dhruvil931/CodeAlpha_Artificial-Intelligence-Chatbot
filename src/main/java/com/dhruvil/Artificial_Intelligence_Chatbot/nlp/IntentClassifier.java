package com.dhruvil.Artificial_Intelligence_Chatbot.nlp;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IntentClassifier {
    private final List<String> greetings =
            List.of(
                    "hi",
                    "hello",
                    "hey",
                    "good morning",
                    "good afternoon",
                    "good evening"
            );

    private final List<String> courseKeywords =
            List.of(
                    "course",
                    "courses",
                    "subject",
                    "subjects",
                    "syllabus",
                    "branch",
                    "curriculum"
            );

    public String classifyIntent(String input) {
        input = input.toLowerCase().trim();

        String[] tokens = input.split("\\s+");

        for(String token: tokens) {
            if(greetings.contains(token)) {
                return "GREETING";
            }

            if(courseKeywords.contains(token)) {
                return "COURSE_INFORMATION";
            }
        }

        return "UNKNOWN";
    }
}
