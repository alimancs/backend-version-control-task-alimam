// package src;

import java.util.List;
import src.Student;
import src.StudentManager;
import src.utils.Validator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Student Management System ===\n");
        
        // Create student manager
        StudentManager manager = new StudentManager();
        
        // Add students
        Student s1 = new Student("STU001", "John", "Doe", "john@example.com", 20, 3.8);
        Student s2 = new Student("STU002", "Jane", "Smith", "jane@gmail.com", 22, 3.2);
        Student s3 = new Student("STU003", "Alice", "Johnson", "alice@yahoo.com", 19, 3.9);
        
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        
        // Display students
        manager.displayAllStudents();
        
        // Show validation
        System.out.println("\n=== Validations ===");
        Student invalidStudent = new Student("INV001", "Test", "User", "invalid-email", 150, 5.0);
        System.out.println(Validator.validateWithMessage(invalidStudent));
        
        // Show statistics
        System.out.println("\n=== Statistics ===");
        System.out.println("Average GPA: " + manager.getAverageGpa());
        System.out.println("Honors students: " + manager.getHonorsStudents().size());
        
        // Search
        System.out.println("\n=== Search for 'John' ===");
        List<Student> results = manager.searchByName("John");
        for (Student s : results) {
            System.out.println(s.getStudentInfo());
        }
    }
}