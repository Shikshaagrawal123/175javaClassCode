import java.util.Scanner;

class EmployeeEncap{
    private int acc_bal;
    private int upi_pin = 998899;
    public void setBalance(int balance){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter UPI pin");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            acc_bal=balance;
            System.out.println("Congrats saalry is credited");
        }
        else{
            System.out.println("Salary not credited.");
        }
    }

    public int getBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("To know the balance please enter UPT pin");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            System.out.println("Available balance is: "+acc_bal);
            return acc_bal;
        }
        else{
            System.out.println("Wrong!! Unable to fetch balance");
        }
        return -1;

    }
}


public class ENcapsulation {
    public static void main(String[] args){
        EmployeeEncap ee=new EmployeeEncap();
        ee.setBalance(90000);
        ee.getBalance();
    }

    
}
