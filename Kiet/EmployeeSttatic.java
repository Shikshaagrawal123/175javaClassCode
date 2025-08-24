public class EmployeeSttatic {
    int Emp_ID;
    static String Org;

    void details(){
        System.out.println("ID: "+Emp_ID+" "+"Organization is: "+Org);
    }

    public static void main(String[] args){

        EmployeeSttatic.Org="Kiet";
        EmployeeSttatic es=new EmployeeSttatic();
        es.Emp_ID=101;
        es.details();

    }
}
