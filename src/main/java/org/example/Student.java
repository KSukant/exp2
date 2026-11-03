package org.example;

public class Student {

    public String checkResult(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        }

        if (marks >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
