import java.util.*;
class Employee{
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id , String name , String designation, double salary) {
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public String getDesignation(){
        return designation;
    }
}
class Company{
    private String companyName;
    private Employee employee[];
    private int numEmployees;

    public Company(String companyName , Employee employee[] , int numEmployee){
        this.companyName=companyName;
        this.employee=employee;
        this.numEmployees=numEmployee;
    }
    public double getAverageSalary(Employee employee[]){
        int sum=0;
        int count=0;
        for(int i=0 ; i<employee.length;i++){
            sum +=employee[i].getSalary();
            count +=1;
        }
        double avg = sum/count;
        return avg;
        
    }
    public double getMaxSalary(Employee employee[]){
        double max = employee[0].getSalary();

        for(int i=1 ; i<employee.length ; i++){
            if(max < employee[i].getSalary()){
                max = employee[i].getSalary();
            }
        }
        return max;
    }
    public Employee[] getEmployeesByDesignation(Employee[] employee, String designation){
        Employee emp[] = new Employee[0];

        for(int i=0 ; i<employee.length; i++){
            if(employee[i].getDesignation().equalsIgnoreCase(designation)){
                emp = Arrays.copyOf(emp,emp.length+1);
                emp[emp.length-1] = employee[i];
            }
        }
        if(emp.length>0)
        {
            return emp;
        }
        return null;
    }

}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter company name: ");
        String cm = s.nextLine();
        System.out.print("Enter number of employees: ");
        int num = s.nextInt() ;
        s.nextLine();

        
        Employee e[] = new Employee[num];
        System.out.println("Enter employee details:");
        for(int i=0 ;i<num ; i++){
            System.out.println("Employee "+(i+1)+":");
            System.out.print("Enter id:  ");
            int a = s.nextInt();
            s.nextLine();

            System.out.print("Enter name: ");
            String b = s.nextLine();

            System.out.print("Enter designation: ");
            String c = s.nextLine();

            System.out.print("Enter salary: ");
            double d = s.nextDouble();
            s.nextLine();

            e[i] = new Employee(a,b,c,d);
        }
        Company com = new Company(cm,e,num);

        System.out.println("Average salary: "+com.getAverageSalary(e));
        System.out.println("Max salary: "+com.getMaxSalary(e));

        System.out.print("Employees with designation: ");
        String name= s.nextLine();

        Employee[] emp = com.getEmployeesByDesignation(e, name);
        if(emp !=null){
            for(int i=0 ; i<emp.length ; i++){
                System.out.println("ID: "+emp[i].getId()+", Name: "+emp[i].getName()+", Designation: "+emp[i].getDesignation()+", Salary: "+emp[i].getSalary());
            }
        }
    }
}