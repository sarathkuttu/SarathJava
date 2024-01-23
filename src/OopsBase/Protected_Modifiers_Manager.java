package src.OopsBase;

public class Protected_Modifiers_Manager extends Protected_Modifiers_Employee {


    Protected_Modifiers_Manager(int id, String name) {
        super(id, name);
    }

    public void Approve_Leave() {

        System.out.println("Leave approved for employee id " + this.empid);


    }

    @Override
    protected void Salary_Details() {

        System.out.println("Salary approved my Manager for the employee " + empname);
    }
}
