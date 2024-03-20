package com.etiya;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category(1);
        category1.categoryName = "Mobile";

        System.out.println(category1.getId());

        Category category2 = new Category(2);
        category2.categoryName = "UI/UX Design";

        Course course = new Course(1);
        course.title = "Kotlin";
        List<Course> courseList = List.of(course);
        Teacher teacher1 = new Teacher(1);
        teacher1.name = "Gökhan";
        Teacher teacher2 = new Teacher(2);
        teacher2.name = "Kaan";
        course.assignedTeachers = List.of(teacher1, teacher2);
        teacher1.assignedCourses = courseList;
        teacher1.printAssignedCourse();
    }
}