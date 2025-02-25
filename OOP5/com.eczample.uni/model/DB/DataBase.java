package model.DB;

import java.util.ArrayList;
import java.util.List;
import model.StudentsGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.TeacherServise;
//симулирует базу данных
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static final List<StudentsGroup> groupDB = new ArrayList<>();


    public static void fillDB(){
        TeacherServise servise = new TeacherServise();
        Teacher teacher = new Teacher(1, "Вася", "Иванов");
        servise.addGroupId(1);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Джофри", "Ланистер", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}
