import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CohortTest {
    Cohort cohortTest = new Cohort();

    @Before
    public void setUp(){
        this.cohortTest = new Cohort();
        Student alan = new Student(4L,"Alan");
        alan.addGrade(98);
        alan.addGrade(78);
        alan.addGrade(100);

        Student dean = new Student(4L,"Dean");
        dean.addGrade(67);
        dean.addGrade(89);
        dean.addGrade(88);

        this.cohortTest.addStudent(alan);
        this.cohortTest.addStudent(dean);


    }


    @Test
    public void addStudentTest(){
        assertEquals("Student was not added to cohort student list","Alan",cohortTest.getStudents().get(0).getName());
    }

    @Test
    public void getStudentsTest(){
        Cohort cohortTest2 = new Cohort();
        List<Student> studentsTest = Arrays.asList(
                new Student(10L,"Stew"),
                new Student(9L, "Drew"),
                new Student(8L,"Mars")
        );
        studentsTest.forEach(e -> cohortTest2.addStudent(e));

        assertEquals("The getStudent function does not return a List of Students", studentsTest,cohortTest2.getStudents());

    }
//
    @Test
    public void getCohortAverageTest(){
        System.out.println(cohortTest.getCohortAverage());
        assertEquals("Average was not calculated correctly",(92+((67+89+88)/3))/2,cohortTest.getCohortAverage(),0.9);


    }

}
