import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StudentTest {
    long id = 9L;
    String name = "test";
    List<Integer> grades;

    Student test = new Student(id,name);

    @Test
    public void constructorTest(){


        assertEquals("Id is not set correctly",id,test.id);
        assertEquals("Name is not set correctly",name, test.name);
        assertNotNull("Grades is not set correctly",test.grades );

    }

    @Test
    public void getIdTest(){
        assertEquals("Returned value is incorrect",id,test.getId());
    }

    @Test
    public void getNameTest(){
        assertEquals("Returned value is incorrect",name,test.getName());
    }

    @Test
    public void addGradeTest(){
        int grade = 100;
        test.addGrade(grade);
        assertEquals("Grade was not properly added to array", Optional.of(grade).get(), test.grades.get(test.grades.size()-1));
    }

    @Test
    public void getGradesTest(){
        test.addGrade(99);
        test.addGrade(100);
        test.addGrade(60);

        List<Integer> list = Arrays.asList(99,100,60);

        assertEquals("The grades list does not match",list, test.getGrades());


    }

    @Test
    public void getGradeAverageTest(){
        test.addGrade(99);
        test.addGrade(100);
        test.addGrade(60);

        double average = (double)(99+100+60)/3;

        assertEquals("Average function does not work", average,test.getGradeAverage(),0.03);
    }

}