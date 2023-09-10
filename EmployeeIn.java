import java.util.*;
class Employee{
    String name;
    int id;
}
class Tester extends Employee{
    int salary;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name: ");
        name=sc.nextLine();
        System.out.print("Enter employee id : ");
        id=sc.nextInt();
        System.out.print("Enter employee salary : ");
        salary=sc.nextInt();
        sc.close();
    }

    void display(){
        System.out.println("Employee name : "+name);
        System.out.println("Employee id : "+id);
        System.out.println("Employee salary : "+salary);
    }
}

public class EmployeeIn {
    public static void main(String[] args) {
       Tester obj = new Tester();
       obj.getData();
       obj.display(); 
    }
}
