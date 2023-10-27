import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Student student = new Student();
        
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("(1) Create a student record");
            System.out.println("(2) Update student record");
            System.out.println("(3) Update course");
            System.out.println("(4) Display student details");
            System.out.println("(5) Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Create a student record");
                    input.nextLine(); 
                    System.out.print("Enter student ID No.: ");
                    int studentId = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Enter first name: ");
                    String firstName = input.nextLine();
                    System.out.print("Enter middle name: ");
                    String middleName = input.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter suffix: ");
                    String suffix = input.nextLine();
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    System.out.print("Enter year level: ");
                    int yearLevel = input.nextInt();
                    input.nextLine(); 
                    System.out.print("Enter phone number: ");
                    String phoneNumber = input.nextLine();
                    System.out.print("Enter email: ");
                    String email = input.nextLine();
                    
                    student = new Student(studentId, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email);
                    System.out.println("Student record created successfully.");
                    break;
                case 2:
                    if (student.getStudentId() == 0) {
                        System.out.println("No student record found. Please create a student record first.");
                    } else {
                        System.out.println("Update student record");
                        input.nextLine(); 
                        System.out.print("Enter first name: ");
                        firstName = input.nextLine();
                        System.out.print("Enter middle name: ");
                        middleName = input.nextLine();
                        System.out.print("Enter last name: ");
                        lastName = input.nextLine();
                        System.out.print("Enter suffix: ");
                        suffix = input.nextLine();
                        System.out.print("Enter age: ");
                        age = input.nextInt();
                        System.out.print("Enter year level: ");
                        yearLevel = input.nextInt();
                        input.nextLine(); 
                        System.out.print("Enter phone number: ");
                        phoneNumber = input.nextLine();
                        System.out.print("Enter email: ");
                        email = input.nextLine();
                        
                        student.setFirstName(firstName);
                        student.setMiddleName(middleName);
                        student.setLastName(lastName);
                        student.setSuffix(suffix);
                        student.setAge(age);
                        student.setYearLevel(yearLevel);
                        student.setPhoneNumber(phoneNumber);
                        student.setEmail(email);
                        
                        System.out.println("Student record updated successfully.");
                    }
                    break;
                case 3:
                    if (student.getStudentId() == 0) {
                        System.out.println("No student record found. Please create a student record first.");
                    } else {
                        System.out.println("Update course");
                        System.out.print("Enter course code: ");
                        String courseCode = input.nextLine();
                        System.out.print("Enter course department: ");
                        String courseDepartment = input.nextLine();
                        
                        student.setCourseCode(courseCode);
                        student.setCourseDepartment(courseDepartment);
                        
                        System.out.println("Course updated successfully.");
                    }
                    break;
                case 4:
                    if (student.getStudentId() == 0) {
                        System.out.println("No student record found. Please create a student record first.");
                    } else {
                        System.out.println("Display student details");
                        System.out.println("Student ID No.: " + student.getStudentId());
                        System.out.println("First Name: " + student.getFirstName());
                        System.out.println("Middle Name: " + student.getMiddleName());
                        System.out.println("Last Name: " + student.getLastName());
                        System.out.println("Suffix: " + student.getSuffix());
                        System.out.println("Age: " + student.getAge());
                        System.out.println("Year Level: " + student.getYearLevel());
                        System.out.println("Phone Number: " + student.getPhoneNumber());
                        System.out.println("Email: " + student.getEmail());
                        System.out.println("Course Code: " + student.getCourseCode());
                        System.out.println("Course Department: " + student.getCourseDepartment());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (choice != 5);
        
        input.close();
    }
}

class Student {
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private int age;
    private int yearLevel;
    private String phoneNumber;
    private String email;
    private String courseCode;
    private String courseDepartment;
    
    public Student() {

    }
    
    public Student(int studentId, String firstName, String middleName, String lastName, String suffix, int age, int yearLevel, String phoneNumber, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;
        this.age = age;
        this.yearLevel = yearLevel;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public int getStudentId() {
        return studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getMiddleName() {
        return middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getSuffix() {
        return suffix;
    }
    
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getYearLevel() {
        return yearLevel;
    }
    
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCourseCode() {
        return courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    public String getCourseDepartment() {
        return courseDepartment;
    }
    
    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;