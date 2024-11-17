package inheritance;


public class Staff extends Employee {
    private String workingHours;

   
    public Staff(String name, String designation, String department, String email, 
                 String contact, int salary, int number, String workingHours) {
        super(name, designation, department, email, contact, salary, number);
        this.workingHours = workingHours;
    }

   
    public String getWorkingHours() {
        return workingHours;
    }

    
    public String toString() {
        return super.toString() + ", Working Hours: " + workingHours;
    }
}
