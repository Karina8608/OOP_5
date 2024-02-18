package Model;

import lombok.Getter;
import lombok.Setter;

/**
 * Класс Студента расширяющий класс User
 */
@Setter
@Getter
public class Student extends User{
    private Integer idStudent;

    public Student() {
        this("Anton","05.07.2006");
    }

    public Student(String fullName, String dateOfBirth) {
        super(fullName, dateOfBirth);
        this.idStudent = null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                " "+ super.toString();
    }
}
