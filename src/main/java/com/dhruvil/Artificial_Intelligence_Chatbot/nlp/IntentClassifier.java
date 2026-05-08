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

    private final List<String> timingKeywords =
            List.of(
                    "timing",
                    "timings",
                    "time",
                    "schedule",
                    "timetable",
                    "lecture",
                    "lectures",
                    "class",
                    "classes",
                    "college time"
            );

    private final List<String> facultyKeywords =
            List.of(
                    "faculty",
                    "faculties",
                    "teacher",
                    "teachers",
                    "professor",
                    "professors",
                    "staff",
                    "hod",
                    "department"
            );

    private final List<String> examKeywords =
            List.of(
                    "exam",
                    "exams",
                    "test",
                    "tests",
                    "midsem",
                    "endsem",
                    "practical",
                    "practicals",
                    "result",
                    "results"
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

            if(timingKeywords.contains(token)) {
                return "TIMETABLE_INFORMATION";
            }

            if(facultyKeywords.contains(token)) {
                return "FACULTY_INFORMATION";
            }

            if(examKeywords.contains(token)) {
                return "EXAM_INFORMATION";
            }
        }

        return "UNKNOWN";
    }
}
