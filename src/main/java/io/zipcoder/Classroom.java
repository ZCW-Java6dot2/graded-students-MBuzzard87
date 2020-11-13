package io.zipcoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Classroom {
    private Student[] students;


    public Classroom(int maxNumOfStudents) {
        this.students = new Student[maxNumOfStudents];
    }

    public Classroom(Student[] collectStudent) {
        this.students = collectStudent;
    }

    public Classroom() {
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        double classAvg = 0.0;
        for (int i = 0; i < students.length; i++) {
            classAvg += students[i].getAverageExamScore();
        }

        return classAvg / students.length;
    }

    public void addStudent(Student student) {
        for (int j = 0; j < students.length; j++) {
            if (students[j] == null) {
                students[j] = student;
                break;
            } else {
                System.out.println("Geddoutta my class!!!");
            }
        }
    }


    public void removeStudent(String firstName, String lastName) {
        for (int k = 0; k < students.length; k++) {
            if (students[k].getFirstName() == firstName && students[k].getLastName() == lastName) {
                students[k] = null;
                break;
            } else {
                System.out.println("Student got covid, no longer in the class");
            }
        }
        Arrays.sort(students, new SortNulls());
    }


    public Map<String, Character> getGradeBook() {
        Map<String, Character> gradeBook = new HashMap<>();


        for (int l = 0; l < students.length; l++) {
            int betterGrade = 0;
            for (int m = 0; m < students.length; m++) {
                if (students[l].getAverageExamScore() > students[m].getAverageExamScore()) {
                    betterGrade++;
                }
            }
            int studentRank = (betterGrade * 100) / students.length;
            if (studentRank > 89) {
                gradeBook.put(students[l].toString(), 'A');
            } else if (studentRank <= 89 && studentRank > 70) {
                gradeBook.put(students[l].toString(), 'B');
            } else if (studentRank <= 70 && studentRank > 49) {
                gradeBook.put(students[l].toString(), 'C');
            } else if (studentRank <= 49 && studentRank > 11) {
                gradeBook.put(students[l].toString(), 'D');
            } else {
                gradeBook.put(students[l].toString(), 'F');
            }
        }
        return gradeBook;
    }
/*   ^^^^^^^^^^^^^^^^^^^
    Taken from Peter's post on the labs slack channel but changed a bit due to there being a
    possibility of certain students invading an upper percentile in the class.
    "int l" is the student being compared to the other students within the classroom inside the
    nested for loop "m". (nested for loop includes him/herself but will not increment the
    better student variable). Once a student receives a count of who they are better than it
    will multiply betterGrade by 100 and then divide by 30 to determine what percentile they
    will be placed.  The character value is then assigned to the student key.
     */

}


    class SortNulls implements Comparator<Student> {
        public int compare(Student student1, Student student2) {
            if (student1 == null && student2 == null) {
                return 0;
            } else if (student1 == null) {
                return 1;
            } else if (student2 == null) {
                return -1;
            } else {
                return 0;
            }
        }
    }