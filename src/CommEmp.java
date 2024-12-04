public class CommEmp extends Employee_Comm {
    private double sales;
    private double hours_worked;
    private double commission;
    private double weeklyPay;

    public CommEmp(String FirstName, String LastName, String title, double payRate, double hours_worked,double sales) {
        super(FirstName, LastName, title, payRate); // call parent class method
        this.sales = sales;
        this.hours_worked = hours_worked;
        this.weeklyPay = weeklyPay;
    }

    public double getHours_worked() {
        return hours_worked;
    }

    public void setHours_worked(double hours_worked) {
        this.hours_worked = hours_worked;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    @Override
    public double calculateSalary() {
        weeklyPay = this.getPayRate() * this.hours_worked;
        if (sales > 1000)
            commission = sales * 0.10 + weeklyPay;
        System.out.println("Weekly Pay: $"+ getWeeklyPay());
        return commission;
    }

    public void display(){
        System.out.println("Employee: " + getFirstName() + " " + getLastName() +"," +" Title: " + getTitle()+"\n"
                +"Hours Worked: " + hours_worked);
        System.out.println("Commission on Sales: $" + calculateSalary());
    }

}