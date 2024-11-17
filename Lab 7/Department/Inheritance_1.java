package inheritance;
public class Inheritance_1 {
    public static void main(String[] args) {
    
        Staff staff1 = new Staff("Muhammad Hamza", "Lab Assistant", "Computer Science", 
         "hamza@gmail.com", "1234567890", 40000, 1, "9 AM - 5 PM");
        Staff staff2 = new Staff("Muhammad Umer", "Secretary", "Computer Science", 
        "umer@gmail.com", "0987654321", 35000, 2, "10 AM - 6 PM");

       
        Faculty faculty1 = new Faculty("Dr. Ali", "Associate Professor", "Computer Science", 
          "ali@gmail.com", "1122334455", 70000, 3, "9 AM - 3 PM");
        Faculty faculty2 = new Faculty("Dr. Tanveer", "Assistant Professor", "Computer Science", 
       "tanveer@gmail.com", "5566778899", 60000, 4, "10 AM - 4 PM");

       
        Course course1 = new Course("CS101", "Data Structures", "3");
        Course course2 = new Course("CS102", "Algorithms", "3");
        Course course3 = new Course("CS103", "Computer Networks", "4");

       
        faculty1.assignCourse(course1);
        faculty1.assignCourse(course2);
        faculty2.assignCourse(course2);
        faculty2.assignCourse(course3);

        System.out.println("Staff Members:");
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
        System.out.println();

        // Display Faculty information and assigned courses
        System.out.println("Faculty Members:");
        System.out.println(faculty1.toString());
        faculty1.printCourseList();
        System.out.println();

        System.out.println(faculty2.toString());
        faculty2.printCourseList();
    }
}


