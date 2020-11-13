package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassroomTest {

    @Test
    public void testClassroomSize() {
        Integer numOfStudents = 30;

        Classroom classroom = new Classroom();

        Integer actualNumOfStudents = classroom.getStudents().length;

        assertEquals(numOfStudents,actualNumOfStudents);
    }


    @Test
    public void getStudents() {
        Student expectedStudent = new Student("Mike", "Buzzard", new Double[0]);
        Classroom addStudent = new Classroom();
        addStudent.addStudent(expectedStudent);

        Student actualStudent = addStudent.getStudents()[0];

        assertEquals(expectedStudent,actualStudent);
    }



    @Test
    public void addStudent() {
        Student expectedStudent = new Student("Mike", "Buzzard", new Double[0]);
        Classroom addStudent = new Classroom();
        addStudent.addStudent(expectedStudent);

        Student actualStudent = addStudent.getStudents()[0];

        assertEquals(expectedStudent,actualStudent);
    }

    @Test
    public void removeStudent() {

        Student expectedStudent = new Student("Mike", "Buzzard", new Double[0]);
        Classroom addStudent = new Classroom();
        addStudent.addStudent(expectedStudent);
        addStudent.removeStudent("Mike","Buzzard");

        Student actualStudent = addStudent.getStudents()[0];

        assertNull(actualStudent);
    }


    @Test
    public void getAverageExamScore() {

    }



    @Test
    public void getGradeBook() {




    }
}
