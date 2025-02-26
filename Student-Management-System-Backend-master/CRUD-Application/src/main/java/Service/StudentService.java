package Service;

import java.util.List;

import Entity.Student;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student updateStudent(Student student, long id);
    void deleteStudent(long id);
    List<Student> getStudentByYearsOfExperience(int yearsOfEnrollment);
    String findDepartmentById(long id);
    String deleteStudentByYearsOfEnrollment(int yearsOfEnrollment);
}