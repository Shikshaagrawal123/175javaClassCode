package Kiet;

public class Employeekiet {
    public String Emp_Name;
    private int Salary;
    protected int Emp_id;
    String Organization;

    void EmployeeDetails(){
        System.out.println("Details of kiet employees are:" +"\n"+Emp_id+" "+Emp_Name+" "+Organization+" "+Salary);
    }
    public static void main(String[] args){
        Employeekiet ek=new Employeekiet();
        ek.Emp_Name="Divya";
        ek.Emp_id=1;
        ek.Salary=20000;
        ek.Organization="KIET Ghaziabad";
        ek.EmployeeDetails();
    }


}
