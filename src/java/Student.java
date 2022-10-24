import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }
//
    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }
//
    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setGrades(List<Integer> grades) {
//        this.grades = grades;
//    }
}