public class Validator {
    
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    };
    
    public static boolean isValidAge(int age) {
        return age >= 5 && age <= 120;
    };
    
    public static boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    };
    
    public static boolean isValidStudentId(String id) {
        return id != null && id.matches("STU\\d{4}");
    };

        // Validate entire student object
    public static boolean validateStudent(Student student) {
        if (student == null) return false;
        
        return isValidStudentId(student.getStudentId()) &&
               isValidEmail(student.getEmail()) &&
               isValidAge(student.getAge()) &&
               isValidGpa(student.getGpa());
    };
    
    // Validation result with detailed error messages
    public static String validateWithMessage(Student student) {
        if (student == null) return "Student is null";
        if (!isValidStudentId(student.getStudentId())) 
            return "Invalid student ID (must be STU####)";
        if (!isValidEmail(student.getEmail())) 
            return "Invalid email format";
        if (!isValidAge(student.getAge())) 
            return "Invalid age (must be 5-120)";
        if (!isValidGpa(student.getGpa())) 
            return "Invalid GPA (must be 0.0-4.0)";
        return "Valid student";
    };

    public static void printValidationResult(Student student) {
        String result = validateWithMessage(student);
        System.out.println("Validation result: " + result);
        System.out.println("Valid: " + validateStudent(student));
    }


}