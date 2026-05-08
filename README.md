# 🤖 College Assistant Chatbot

A rule-based AI chatbot built using Java and Spring Boot that helps students with common college-related queries such as admissions, courses, fees, exams, placements, faculty information, timetable, and contact details.

---

# 🚀 Features

* Greeting Detection
* Course Information
* Admission Information
* Fee Information
* Timetable / College Timing
* Faculty Information
* Exam Information
* Placement Information
* Contact Information
* Unknown Query Handling
* Exit Operation Handling

---

# 🛠️ Tech Stack

* Java
* Spring Boot
* REST API
* Maven
* Lombok

---

# 📂 Project Structure

```text
src
 └── main
      ├── java
      │    └── com.dhruvil.artificialintelligencechatbot
      │          ├── controller
      │          ├── dto
      │          ├── nlp
      │          ├── service
      │          └── type
      │
      └── resources
           └── application.properties
```

---

# ⚙️ API Endpoint

## Chat API

```http
POST /chat
```

### Request Body

```json
{
  "message": "What are college timings?"
}
```

### Response

```json
{
  "reply": "College timings are from 9:00 AM to 4:00 PM."
}
```

---

# 🧠 NLP Logic

The chatbot uses:

* Keyword-based intent classification
* Tokenization using `split("\\s+")`
* Enum-based intent handling
* Rule-based response generation

---

# 📌 Supported Intents

| Intent                | Example Queries   |
| --------------------- | ----------------- |
| GREETING              | hello, hi         |
| COURSE_INFORMATION    | courses, subjects |
| ADMISSION_INFORMATION | admission process |
| FEE_INFORMATION       | fee structure     |
| TIMETABLE_INFORMATION | college timings   |
| FACULTY_INFORMATION   | faculty details   |
| EXAM_INFORMATION      | exam schedule     |
| PLACEMENT_INFORMATION | placement details |
| CONTACT_INFORMATION   | contact number    |
| EXIT_OPERATION        | bye, exit         |

---

# ▶️ Run Locally

## Clone Repository

```bash
git clone https://github.com/dhruvil931/CodeAlpha_Artificial-Intelligence-Chatbot.git
```

## Open Project

Open the project using IntelliJ IDEA or any Java IDE.

## Run Application

Run the main Spring Boot application file.

---

# 📸 API Testing

You can test APIs using:

* Postman
* Thunder Client
* Insomnia

---

# 🔥 Future Improvements

* Database-based responses
* Context-aware conversations
* Frontend integration
* AI/ML-based NLP
* Typo handling
* Voice assistant support

---

# 👨‍💻 Author

Dhruvil Kapadiya
