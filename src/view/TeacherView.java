package view;

import Model.Teacher;

public class TeacherView implements View<Teacher>{
    @Override
    public void print(Teacher user) {
        System.out.println(user);
    }
}