package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


    @Test
    public void studentTest() {
        //Given
        String expectedFirstName = "Buzz";
        String expectedLastName = "Buzzard";
        Double[] expectedExamScore = {100.0, 95.7, 98.1};
        String expectedExamScoreString = "Exam Scores:\n\tExam 1 -> 100.0\n\tExam 2 -> 95.0\n\tExam 3 -> 98.1\n";

        //When
        Student student = new Student(expectedFirstName,expectedLastName,expectedExamScore);

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualExamScores = student.getExamScores();


        Assert.assertEquals(expectedFirstName,actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScoreString, actualExamScores);
    }


    @Test
    public void testFirstName() {
        String expectedFirstName = "Buzz";

        Student student = new Student(expectedFirstName,"",new Double[]{100.0, 95.7, 98.1});

        String actualFirstName = student.getFirstName();

        Assert.assertEquals(expectedFirstName,actualFirstName);
    }

    @Test
    public void testLastName() {
        String expectedLastName = "Buzz";

        Student student = new Student("",expectedLastName,new Double[]{100.0, 95.7, 98.1});

        String actualLastName = student.getLastName();

        Assert.assertEquals(expectedLastName,actualLastName);

    }

    @Test
    public void testExamScores() {
        String expectedExamScoreString = "Exam Scores:\n\tExam 1 -> 100.0\n\tExam 2 -> 95.0\n\tExam 3 -> 98.1\n";

        Student student = new Student("","",new Double[]{100.0, 95.0, 98.1});

        String actualExamScore = student.getExamScores();

        Assert.assertEquals(expectedExamScoreString, actualExamScore);
    }
}