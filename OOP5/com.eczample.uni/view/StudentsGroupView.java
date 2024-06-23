package view;

import java.util.List;
import model.DB.DataBase;
import model.StudentsGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudentsGroupView {

    public void output(){
        DataBase.fillDB();

        Teacher teacher = DataBase.teachersDB.get(0);
        List <Student> students = DataBase.studentsDB;


        StudentsGroup group = new StudentsGroup(teacher, students);
        
        System.out.println("Teacher: " + group.getTeacher().getId());
        System.out.println("Students:");
        for (Student student : group.getStudents()){
            System.out.println(student.getId());
        }
    }


}
