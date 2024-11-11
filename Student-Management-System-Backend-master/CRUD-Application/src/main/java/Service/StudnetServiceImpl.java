package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Student;
import Repository.StudentRepository;

@Service
public class StudnetServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student getStudentById(long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
            return student.get();
        }
        else{
            throw new RuntimeException();
        }
    }
    @Override
    public Student updateStudent(Student student, long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(
            ()-> new RuntimeException()
        );
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartment(student.getDepartment());
        existingStudent.setYearOfEnrollment(student.getYearOfEnrollment());
        return existingStudent;
    }
    @Override
    public void deleteStudent(long id) {
        studentRepository.findById(id).orElseThrow( () -> new RuntimeException());
        studentRepository.deleteById(id);
    }
    public List<Student> getStudentsByYearOfEnrollment(int year) {
        return studentRepository.findByYearOfEnrollment(year);
    }
    public String getDepartmentByStudentId(Long id) {
        return studentRepository.findDepartmentByStudentId(id);
    }
}