package service;

import java.util.List;
import model.DB.DataBase;
import model.StudentsGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudentsGroupServise {
    public StudentsGroup createStudentsGroup(Teacher teacher, List<Student> students){
        StudentsGroup group = new StudentsGroup(teacher, students);
        DataBase.groupDB.add(group);
        return group;

    }
}