class Course{
    String courseName;
    int duration;
    int fees;

    static String instituteName = "Chitkra University";

    Course(String courseName, int duration, int fees){
        this.courseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    public void displayCourseDetails(){
        System.out.println("Course name: " + this.courseName);
        System.out.println("Course duration: " + this.duration + " months");
        System.out.println("Course fees: Rs." + this.fees);
        System.out.println("Institute name : " + instituteName);
    }

    public static void updateInstituteName(String instituteName ){
        Course.instituteName = instituteName;
    }   
}
public class OnlineCourseManagement {
    public static void main(String[] args) {
        Course course1 = new Course("Java", 2, 1500);
        course1.displayCourseDetails();

        System.out.println();
        Course.instituteName = "Chitkara Uniervsity, Punjab";
        Course course2 = new Course("Full Stack", 5, 2000);
        course2.displayCourseDetails();
        System.out.println();
        course1.displayCourseDetails();

    }
   
}
