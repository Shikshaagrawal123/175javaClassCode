interface Institute{
    void Register();
    void Infrastructure();
    void Students();
    void Staff();
    static void staticConcrete(){
        System.out.println("Static Concrete method inside interface");
    }
    default void defConcrete(){
        privateConcrete();
        System.out.println("Default concrete method inside interface");

    }
private void privateConcrete(){
    System.out.println("Private method inside interface");

    
}

class ABES implements Institute{
       public void Register(){
        System.out.println("Kiet is registered with AKTU.");
       } 

       public void Infrastructure(){
        System.out.println("KIET has digital classrooms and labs");
       }

       public void Students(){
        System.out.println("Admissions are done through counselling");
       }
       public void Staff(){
        System.out.println("KIET has well trained staff");
       }
       
    }





public class InterfaceExample {
    public static void main(String[] args){
        Institute ii;
        ii.Register();
        ii.Infrastructure();
        ii.Staff();
        ii.Students();
        Institute.staticConcrete();

    }
    
}
