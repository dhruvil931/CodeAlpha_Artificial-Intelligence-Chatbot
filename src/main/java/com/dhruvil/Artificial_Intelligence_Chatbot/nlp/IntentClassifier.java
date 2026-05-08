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

    private final List<String> admissionKeywords =
            List.of(
                    "admission",
                    "admissions",
                    "apply",
                    "application",
                    "enroll",
                    "enrollment",
                    "join",
                    "college admission",
                    "register"
            );

    private final List<String> feeKeywords =
            List.of(
                    "fee",
                    "fees",
                    "payment",
                    "tuition",
                    "cost",
                    "semester fee"
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

            if(admissionKeywords.contains(token)) {
                return "ADMISSION_INFORMATION";
            }

            if(feeKeywords.contains(token)) {
                return "FEE_INFORMATION";
            }
        }

        return "UNKNOWN";
    }
}
