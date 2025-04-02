package Q5;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Dr.Razeen", "Data Structure");

        Course course = new Course("Data Structure", "CTEC 12063",lecturer);

        Student student = new Student("Sasikala B.R.S", "BICT", course.getCourseName());

        System.out.println("Course Details:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.printf("Lecturer: %s%n", course.getLecturer().getLecturerName());

        System.out.println("\n");

        System.out.println("Student Details:");
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Following Course: " + student.getCourseFollowing());
    }
}


