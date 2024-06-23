package controller;

import model.impl.Teacher;
import service.TeacherServise;

public class TeacherController {

    private TeacherServise servise = new TeacherServise();

    public Teacher createTeacher(String name, String lastName){
        return servise.createTeacher(name, lastName);
    }

    

}
