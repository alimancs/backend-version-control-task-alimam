public class Validator {
    
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
    public static boolean isValidAge(int age) {
        return age >= 5 && age <= 120;
    }
    
    public static boolean isValidGpa(double gpa) {
        return gpa >= 0.0 && gpa <= 4.0;
    }
    
    public static boolean isValidStudentId(String id) {
        return id != null && id.matches("STU\\d{4}");
    }
}