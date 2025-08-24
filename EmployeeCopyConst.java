public class EmployeeCopyConst {
    int Emp_id;
    String Emp_name;

    EmployeeCopyConst(int i,String name){
        Emp_id=i;
        Emp_name=name;
    }
    EmployeeCopyConst(EmployeeCopyConst s2){
        Emp_id=s2.Emp_id;
        Emp_name=s2.Emp_name;

    }
    void printInfo(){
        System.out.println("Details of Employee are:" +Emp_id +" "+Emp_name);
    }
    public static void main(String[] args) {
        //class name ->ref variable=new classname(parameters)
        EmployeeCopyConst ecc= new EmployeeCopyConst(101,"Divya");
        ecc.printInfo();
        EmployeeCopyConst copy  =new EmployeeCopyConst(ecc);
        copy.printInfo();
        copy.Emp_id=2;
        System.out.println("Details after changing in copy : ");
        copy.printInfo();
         


        // EmployeeCopyConst copy;
        // copy=ecc;
        // copy.printInfo();
        // copy.Emp_id=2;
        // copy.Emp_name="Shubhi";
        // System.out.println("Details after change by copy: ");
        // copy.printInfo();
        // ecc.printInfo();

    }
}
