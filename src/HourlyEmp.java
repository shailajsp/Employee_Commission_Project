public class HourlyEmp extends Employee_Comm {  // HourlyEmp is child class of Employee parent class
    private double hoursWorked;

    public HourlyEmp(String firstName, String lastName, String title, double payRate, double hoursWorked) {
        super(firstName,lastName,title,payRate); // call parent class method
        this.hoursWorked = hoursWorked;
    }
    //getter Method
    public double getHoursWorked() {
        return hoursWorked;
    }
    //setter Method
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    //Calculate hourly salary
    public double calculateSalary() {
        double hourly_Salary = this.getPayRate() * hoursWorked;
        return hourly_Salary;
    }

    public void display(){
        System.out.println("Employee: " + getFirstName() + " "+ getLastName() +"," +" Title: " + getTitle()+"\n"
                +"Hours Worked: " + hoursWorked + "\n" + "Weekly Pay: $"+ calculateSalary());
    }
}