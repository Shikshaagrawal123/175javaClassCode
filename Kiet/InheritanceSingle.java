class Employee{
    int id;
    String name;
    String org;
    void details(){
        System.out.println("Details are: "+id+name+org);
    }

}

class Faculty extends Employee{
    String dept;
    String subject;
    void facultyDetails(){
        System.out.println("Department is: "+dept+"\nSubject is: "+subject);
    }

    
}
public class InheritanceSingle{
    public static void main(String[] args){
        Faculty f1=new Faculty();
        f1.id=101;
        f1.name="Shiksha";
        f1.org="KIET";
        f1.subject="Java";
        f1.dept="CSEAIML";
        f1.details();
        f1.facultyDetails();


    }

}

