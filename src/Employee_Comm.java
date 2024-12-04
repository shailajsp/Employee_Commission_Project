

import java.util.Objects;
import java.util.Scanner;

    public class Employee_Comm {
        protected String firstName;
        protected String lastName;
        protected String title;
        protected double payRate;

        public Employee_Comm() { // empty Constructor
        }

        public Employee_Comm(String firstName, String lastName, String title, double payRate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.title = title;
            this.payRate = payRate;
        }

        public void inputEmployee() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter employee type (salaried/hourly/commissioned): ");
            String employeeType = scanner.nextLine();
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            lastName = scanner.nextLine();
            System.out.print("Enter title: ");
            title = scanner.nextLine();

            switch (employeeType) { // Check Employee Type
                case "salaried": {
                    System.out.print("Enter annual salary: ");
                    payRate = scanner.nextDouble();
                    SalaryEmp salaryEmpObj = new SalaryEmp(firstName, lastName, title, payRate);
                    salaryEmpObj.display();
                    break;
                }
                case "hourly": {
                    System.out.print("Hourly rate: ");
                    payRate = scanner.nextDouble();
                    System.out.print("Enter hours worked: ");
                    double hoursWorked = scanner.nextDouble();
                    HourlyEmp hourlyEmpObj = new HourlyEmp(firstName, lastName, title, payRate, hoursWorked);
                    hourlyEmpObj.display();
                    break;
                }
                case "commissioned": {
                    System.out.print("Hourly rate: ");
                    payRate = scanner.nextDouble();
                    System.out.print("Enter hours worked: ");
                    double hours_worked = scanner.nextDouble();
                    System.out.print("Enter the sales: ");
                    double sales = scanner.nextDouble();
                    CommEmp commEmpObj = new CommEmp(firstName, lastName, title, payRate, hours_worked, sales);
                    commEmpObj.display();
                    break;
                }

            }

        }

        public double calculateSalary() {
            return 0.0;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPayRate() {
            return payRate;
        }

        public void setPayRate(double payRate) {
            this.payRate = payRate;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", title='" + title + '\'' +
                    ", payRate=" + payRate +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Employee_Comm employee = (Employee_Comm) o;
            return Double.compare(payRate, employee.payRate) == 0 && Objects.equals(firstName, employee.firstName)
                    && Objects.equals(lastName, employee.lastName) && Objects.equals(title, employee.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName, title, payRate);
        }

    }
