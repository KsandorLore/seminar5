package model;

import java.util.List;
import model.impl.Student;
import model.impl.Teacher;

public class StudentsGroup {
    
    private Teacher teacher;
    private List<Student> students;

    public StudentsGroup(Teacher teacher, List<Student> students){
        this.teacher = teacher;
        this.students = students;
        
    }
    
    public Teacher getTeacher(){
        return teacher;

    }

    public List<Student> getStudents(){
        return students;
        
    }
    
}

