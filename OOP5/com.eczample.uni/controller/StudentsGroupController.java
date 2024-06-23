package controller;

import java.util.List;
import model.StudentsGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.StudentsGroupServise;

public class StudentsGroupController {
    private StudentsGroupServise servise = new StudentsGroupServise();

    public StudentsGroup createStudentsGroup(Teacher teacher, List<Student> students){
        
        return servise.createStudentsGroup(teacher, students);

    }

}
