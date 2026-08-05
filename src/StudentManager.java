import java.util.ArrayList;
import java.util.List;
import src.utils.Validator;


public class StudentManager {
    private List<Student> students;
    
    public StudentManager() {
        this.students = new ArrayList<>();
    }
    
    // Add a student with validation
    public boolean addStudent(Student student) {
        if (Validator.validateStudent(student)) {
            students.add(student);
            return true;
        }
        return false;
    }
    
    // Find student by ID
    public Student findStudentById(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }
}