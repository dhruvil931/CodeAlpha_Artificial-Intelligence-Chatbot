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

            case "FACULTY_INFORMATION":
                return """
                        Faculty information:
                        - Highly qualified professors
                        - Experienced teaching staff
                        - Dedicated HODs for each department
                        - Practical and project-based learning support
                        """;

            case "EXAM_INFORMATION":
                return """
                    Exam information:
                    - Mid-sem exams are conducted in September
                    - End-sem exams are conducted in December
                    - Practical exams are scheduled before end-sem exams
                    - Results are published on the student portal
                    """;

            case "PLACEMENT_INFORMATION":
                return """
                    Placement information:
                    - Top recruiters: TCS, Infosys, Wipro, Accenture
                    - Average package: ₹4.5 LPA
                    - Highest package: ₹12 LPA
                    - Placement training sessions are conducted regularly
                    """;

            default:
                return "Sorry, I didn't understand that.";
        }
    }
}
