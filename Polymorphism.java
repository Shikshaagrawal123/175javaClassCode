class EmployeePoly{
    String Emp_Name;
    void details(){
        System.out.println("Name: "+Emp_Name);
    }
    void details(int salary){
        System.out.println("Salary: "+salary);

    }
    void details(String company ){
        System.out.println("Institute: "+company);

    }

}


class Faculty extends EmployeePoly{
    void details(){
        super.details();
        System.out.println("Welcome Faculties!");
    }
}
public class Polymorphism {
    public static void main(String[] args){
        // EmployeePoly ep =new EmployeePoly();
        // ep.Emp_Name="arjun";
        // ep.details();
        // ep.details(10000);
        // ep.details("Kiet");
        Faculty f=new Faculty();
        f.Emp_Name="arjun";
        f.details();



    }
    
}
