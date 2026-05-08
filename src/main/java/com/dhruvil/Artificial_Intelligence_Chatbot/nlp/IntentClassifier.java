package com.dhruvil.Artificial_Intelligence_Chatbot.nlp;

import com.dhruvil.Artificial_Intelligence_Chatbot.type.IntentType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class IntentClassifier {
    private final Map<IntentType, List<String>> keywords =
            Map.of(

                    IntentType.GREETING,
                    List.of(
                            "hi",
                            "hello",
                            "hey",
                            "greetings",
                            "morning",
                            "afternoon",
                            "evening"
                    ),

                    IntentType.COURSE_INFORMATION,
                    List.of(
                            "course",
                            "courses",
                            "subject",
                            "subjects",
                            "syllabus",
                            "branch",
                            "curriculum",
                            "engineering",
                            "department",
                            "study"
                    ),

                    IntentType.ADMISSION_INFORMATION,
                    List.of(
                            "admission",
                            "admissions",
                            "apply",
                            "application",
                            "enroll",
                            "enrollment",
                            "join",
                            "register",
                            "registration",
                            "eligibility",
                            "documents",
                            "criteria"
                    ),

                    IntentType.FEE_INFORMATION,
                    List.of(
                            "fee",
                            "fees",
                            "payment",
                            "tuition",
                            "cost",
                            "price",
                            "charges",
                            "expense",
                            "semester"
                    ),

                    IntentType.TIMETABLE_INFORMATION,
                    List.of(
                            "timing",
                            "timings",
                            "schedule",
                            "timetable",
                            "lecture",
                            "lectures",
                            "class",
                            "classes",
                            "period",
                            "periods",
                            "time",
                            "start",
                            "opening"
                    ),

                    IntentType.FACULTY_INFORMATION,
                    List.of(
                            "faculty",
                            "teacher",
                            "teachers",
                            "professor",
                            "professors",
                            "staff",
                            "hod",
                            "mentor",
                            "lecturer"
                    ),

                    IntentType.EXAM_INFORMATION,
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
                            "results",
                            "marks",
                            "grade",
                            "grades"
                    ),

                    IntentType.PLACEMENT_INFORMATION,
                    List.of(
                            "placement",
                            "placements",
                            "job",
                            "jobs",
                            "recruitment",
                            "recruiter",
                            "company",
                            "companies",
                            "package",
                            "salary",
                            "career",
                            "internship"
                    ),

                    IntentType.CONTACT_INFORMATION,
                    List.of(
                            "contact",
                            "contacts",
                            "phone",
                            "mobile",
                            "email",
                            "address",
                            "location",
                            "office",
                            "reach",
                            "map"
                    ),

                    IntentType.EXIT_OPERATION,
                    List.of(
                            "exit",
                            "quit",
                            "bye",
                            "goodbye",
                            "close",
                            "stop",
                            "end"
                    )
            );


    public IntentType classifyIntent(String input) {
        input = input.toLowerCase().trim();

        String[] tokens = input.split("\\s+");

        for(String token : tokens) {

            for(Map.Entry<IntentType, List<String>> entry
                    : keywords.entrySet()) {

                if(entry.getValue().contains(token)) {
                    return entry.getKey();
                }
            }
        }

        return IntentType.UNKNOWN;
    }
}
