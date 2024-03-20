package com.etiya;

import java.util.List;

public class Course {
    private int id;
    String title;
    String programmingLanguage;
    List<Teacher> assignedTeachers;

    public Course(int id, String title, String programmingLanguage, List<Teacher> assignedTeachers) {
        this.id = id;
        this.title = title;
        this.programmingLanguage = programmingLanguage;
        this.assignedTeachers = assignedTeachers;
    }

    public Course(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
