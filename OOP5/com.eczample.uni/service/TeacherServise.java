package service;

import java.util.ArrayList;
import java.util.List;
import model.DB.DataBase;
import model.impl.Teacher;

public class TeacherServise {

    private final List<Integer> groups = new ArrayList<>();
    

    public Teacher createTeacher(String name, String lastName){
        int id;
        int size = DataBase.teachersDB.size();
        id = size + 1;
        Teacher teacher = new Teacher(id, name, lastName);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public void addGroupId(int groupId){
        groups.add(groupId);
    }



}
