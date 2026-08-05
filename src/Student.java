package src;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private double gpa;
    
        // Constructor
    public Student(String studentId, String firstName, String lastName, 
                   String email, int age, double gpa) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Getters
    public String getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    
    // Setters
    public void setEmail(String email) { this.email = email; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    
    @Override
    public String toString() {
        return String.format("Student[ID=%s, Name=%s %s, GPA=%.2f]", 
                            studentId, firstName, lastName, gpa);
    }

        public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public boolean isHonorsStudent() {
        return gpa >= 3.5;
    }
    
    public String getStudentInfo() {
        return String.format("ID: %s | Name: %s | GPA: %.2f | Status: %s",
                            studentId, getFullName(), gpa, 
                            isHonorsStudent() ? "Honors" : "Regular");
    }

}