
public class methodCode {
    int id;
    String name;

    public void displayMethod(){
        System.out.println("Hello from display method");
        System.out.println("Details are: " + id + " " + name);
    }

    public static void main(String[] args){
        methodCode m1 = new methodCode();
        // m1.id = 101;
        // m1.name = "Shiksha";
        m1.displayMethod();

        
        Employee e = new Employee();
        e.getDetails();
    }
}


class Employee {
    String empName;
    double salary;

    public void getDetails() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
        sc.close();

        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}
