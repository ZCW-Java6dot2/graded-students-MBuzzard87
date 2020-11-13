package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores ) {
        this.firstName = firstName;
        this.lastName = lastName;
        examScores = new ArrayList<Double>(Arrays.asList(testScores));
    }

    @Override
    public String toString() {
        return String.format("Student Name: %s %s\n> Average Score: %3.1f\n", getFirstName(), getLastName(), getAverageExamScore() + ">" + getExamScores());
    }



    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScores(int identify, double reassign) {
        examScores.set(identify,reassign);
    }

    public Integer getNumberOfExamsTaken() {

        return examScores.size();
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for(Double scores : examScores) {
            sum += scores;
        }

        return sum / examScores.size();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getExamScores() {
        String examScoreString = "Exam Scores:\n";
        for(int i = 0; i < examScores.size(); i++) {
            examScoreString += String.format("\tExam %d -> %.1f\n",i + 1, examScores.get(i));
        }
        return examScoreString;
    }


}
