package service;

import Model.Teacher;

/**
 * Класс Модели Преподавателя
 */
public class TeacherService implements DataService<Teacher>{
    private static int teacherIndex;
    static {
        teacherIndex = 0;
    }

    private Teacher teacher;
    @Override
    public void create(Teacher user) {
        user.setIdTeacher(teacherIndex++);
        teacher = user;

    }

    @Override
    public Teacher read(int id) {
        return teacher;
    }

    @Override
    public int getTotalNumber() {
        return 1;
    }
}
