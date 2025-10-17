# Java Coursework Projects - Atlantic Technological University

This repository contains a collection of **Java applications** developed as part of my coursework at **ATU Galway City**. Each semester showcases projects and exercises that build upon fundamental and advanced Java programming concepts.

## 📂 Project Structure

The **main branch** is divided into semester folders:

```
YearOneSemesterOne/
YearOneSemesterTwo/
YearTwoSemesterOne/
YearTwoSemesterTwo/
```

Each folder represents coursework for that academic period and follows its own internal structure.

### 🧩 Year One - Semester One

Contains multiple Java packages, each featuring files like:

* **`EverythingOne.java`**, **`EverythingTwo.java`**, etc. -
  Each file includes a `main()` method that executes several exercises (e.g., `exerciseOne()`, `exerciseTwo()`, ...).
  Run these files directly to explore grouped exercises within a single program.

* **`exams/`** - Contains individual Java classes such as `ExamOne.java`, `SampleExamTwo.java`, etc., representing sample or graded assessments.

### 🧩 Year One - Semester Two

Follows a similar layout to Semester One, but packages may include multiple helper classes that support the main `EverythingN.java` program.
An **`exams/`** package is also present, containing standalone exam and sample exam files.

### 🧩 Year Two - Semester One

Uses the same Eclipse package structure. Some packages may contain only helper or class definition files without `EverythingN.java` programs.

### 🧩 Year Two - Semester Two

This semester includes two separate Eclipse projects:

#### **Software/**

```
src/
├── assessment/         → main Runner.java + helper classes
├── assessmentFiles/     → PDF, CSV, TXT and other input resources
├── resources/           → lab classes used for coursework
└── runners/             → RunnerOne.java … RunnerN.java (execute labs)
```

#### **JUnitFive/**

```
src/
├── exam/   → ExamClass.java + ExamTest.java + ExamTestParameterized.java
├── main/   → ClassOne.java … ClassN.java (core logic)
└── test/   → TestOne.java … TestN.java (JUnit test cases)
```

Each `TestN.java` corresponds to its respective class in `main/`.

## ✅ Tested Environment

These projects were tested on the following setup:

* **Operating System:** Windows 11 (x64)
* **IDE:** Eclipse IDE (2025-09 release)
* **Java Version:** Java SE 22

## 🏗️ Building and Running the Programs

### ▶️ **Java Applications**

1. Open the desired semester folder (e.g., `YearOneSemesterOne`, `Software`, etc.) in **Eclipse**.
2. Locate the file that contains a **`public static void main(String[] args)`** method — for example:

   * `EverythingOne.java`, `EverythingTwo.java`, `Runner.java`, etc.
3. Right-click the file → **Run As → Java Application**.
4. The console output or dialog windows (e.g., `JOptionPane`) will display the program’s execution results.

### 🧪 **JUnit Projects**

1. Open the **JUnitFive** project in Eclipse.
2. Navigate to the `exam/` or `test/` packages.
3. Select a test file (e.g., `ExamTest.java`, `ExamTestParameterized.java`, or `TestOne.java`).
4. Right-click the file → **Run As → JUnit Test**.
5. The JUnit runner will display test results in the Eclipse **JUnit panel**, showing which cases passed or failed.

## 📜 License

This project is intended for educational purposes.
You are welcome to explore, modify, and learn from the code.

## 🙏 Acknowledgments

Thank you for checking out my Java coursework repository!
If you have any feedback or suggestions, feel free to reach out.
