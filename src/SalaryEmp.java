
public class SalaryEmp extends Employee_Comm {   //SalaryEmp is child class

    public SalaryEmp(String FirstName, String LastName, String title, double payRate) {
        super(FirstName, LastName, title, payRate); // call parent class method

    }

    @Override
    public double calculateSalary() {
        double biMonthlySalary = this.getPayRate()/24;
        return Math.round(biMonthlySalary);
    }

    public void display(){
        System.out.println("Employee: " + getFirstName() + " " + getLastName() +"," +" Title: " + getTitle()+"\n"
                +"Bi-Monthly salary: $" + calculateSalary());
    }
}