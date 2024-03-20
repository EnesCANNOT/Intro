package com.etiya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher {
    private int id;
    String name;
    List<Course> assignedCourses;

    public Teacher(int id, String name, List<Course> assignedCourses){}
    public Teacher(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

//    @Override
//    public String toString(){
//        return this.assignedCourses + this;
//    }

    public void printAssignedCourse(){
        List<String> teachers = new ArrayList<>();

        for(Course course : this.assignedCourses){
            for(Teacher teacher : course.assignedTeachers){
                teachers.add(teacher.name);
            }
        }

        for(Course course : this.assignedCourses){
            String joined = String.join(",", teachers);
            System.out.println(joined + " -> " + course.title);
        }
    }
}
