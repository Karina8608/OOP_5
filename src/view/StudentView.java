package view;

import Model.Student;

public class StudentView implements View<Student> {

    public void print(Student student){
        System.out.println(student);
    }

}
