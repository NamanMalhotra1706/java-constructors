class Student {
    public int rollNumber;
    protected String studentName;
    private double CGPA;

    Student(int rollNumber, String name, double cgpa){
        this.rollNumber = rollNumber;
        this.studentName = name;
        this.CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + this.studentName);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {
    public String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Calling super constructer as CGPA is private
        this.researchTopic = researchTopic;
    }

    public void displayPostgraduateDetails() {
        displayStudentDetails();
        System.out.println("Research Topic: " + researchTopic);
    }
}


public class UniversityManagement{
    public static void main(String[] args) {
        Student student1 = new Student(2110990913, "Naman Malhotra",9.33);
        student1.displayStudentDetails();

        // Cannot Access CGPA to student class
       // student1.cgpa = 9.5; ---> gives error


       System.out.println("\nUpdating CGPA...");
       student1.setCGPA(9.55);
       student1.displayStudentDetails();

       System.out.println("\nCreating Postgraduate Student...");
       PostgraduateStudent pgStudent = new PostgraduateStudent(2110990862, "Manvi Grover", 9.25, "Artificial Intelligence");
       pgStudent.displayPostgraduateDetails();
    }
}