package src.OopsBase;

public class Protected_Modifiers_Employee {

    protected int empid;

    public String empname;


    Protected_Modifiers_Employee(int id, String name) {

        this.empid = id;

        this.empname = name;


    }

    protected void Salary_Details() {

        System.out.println("Calculate the salary of employee ID " + this.empid);


    }

    protected void Employee_Details() {

        System.out.println("The Employee Name is " + this.empname);
    }
}
