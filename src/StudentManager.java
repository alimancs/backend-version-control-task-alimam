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

        // Remove student
    public boolean removeStudent(String studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
    
    // Get all students
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
    
    // Get student count
    public int getStudentCount() {
        return students.size();
    }
    
    // Search by name (contains)
    public List<Student> searchByName(String name) {
        List<Student> results = new ArrayList<>();
        String searchLower = name.toLowerCase();
        for (Student s : students) {
            if (s.getFirstName().toLowerCase().contains(searchLower) ||
                s.getLastName().toLowerCase().contains(searchLower)) {
                results.add(s);
            }
        }
        return results;
    }
}