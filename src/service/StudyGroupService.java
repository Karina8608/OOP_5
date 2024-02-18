package service;

import Model.StudyGroup;
import lombok.Getter;
/**
 * Класс Модели Учебной Группы
 */
@Getter
public class StudyGroupService implements DataService<StudyGroup> {

    StudyGroup studyGroup;

    @Override
    public void create(StudyGroup user) {
        studyGroup = user;

    }

    public void setTeacher(TeacherService teacherService, int teacherId){
        studyGroup.setTeacher(teacherService.read(teacherId));
    }

    public void setStudentsList(StudentService studentService){
        studyGroup.setStudentsList(studentService.getStudentsList());
    }

    @Override
    public StudyGroup read(int id) {
        return null;
    }

    @Override
    public int getTotalNumber() {
        return studyGroup.getStudentsList().size();
    }
}
