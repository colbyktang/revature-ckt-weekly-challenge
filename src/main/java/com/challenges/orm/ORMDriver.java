package com.challenges.orm;

import com.challenges.orm.models.FacultyMember;
import com.challenges.orm.models.Student;

public class ORMDriver {
    public static void main(String[] args) {
        Student student = new Student ("Joe", "Test", "jtest", "jtest@email.com", "Comp Sci", 3.0f);
        Student student2 = new Student ("John", "Test", "jotest", "jotest@email.com", "Comp Sci", 3.0f);
        Student student3 = new Student ("Jack", "Test", "jatest", "jatest@email.com", "Comp Sci", 3.0f);
        Student student4 = new Student ("Colby", "Tang", "ctang", "ctang@email.com", "Comp Sci", 3.0f);
        FacultyMember facultyMember = new FacultyMember("Colby", "Tang", "ctang2", "ctang2@email.com", "Comp Sci");
        String pass = "pass";
        System.out.println();
        String sqlQuery = ObjectRelationMapper.createObject(student, "users");
        System.out.println(sqlQuery);
    }
}
