import java.util.ArrayList;
import java.util.List;
import src.utils.Validator;


public class StudentManager {
    private List<Student> students;
    
    public StudentManager() {
        this.students = new ArrayList<>();
    }

    // BUG: intentional bug
    public List<Student> getStudentsAsList() {
        return students;  // BUG: Exposing internal list.
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

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("=== STUDENTS LIST ===");
        for (Student s : students) {
            System.out.println(s.getStudentInfo());
        }
        System.out.println("Total: " + getStudentCount() + " students");
    }
    
    // Get average GPA
    public double getAverageGpa() {
        if (students.isEmpty()) return 0.0;
        double sum = 0;
        for (Student s : students) {
            sum += s.getGpa();
        }
        return sum / students.size();
    }
    
    // Get honors students
    public List<Student> getHonorsStudents() {
        List<Student> honors = new ArrayList<>();
        for (Student s : students) {
            if (s.isHonorsStudent()) {
                honors.add(s);
            }
        }
        return honors;
    }
}
}