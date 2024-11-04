import java.util.*;
class Employee{
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    public Employee(int employeeId , String employeeName, int age, char gender, double salary) {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.age=age;
        this.gender=gender;
        this.salary=salary;
    }
    public int getId(){
        return employeeId;
    }
    public String getName(){
        return employeeName;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
    public double getsal(){
        return salary;
    }
    
}

public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();  s.nextLine();
        Employee emp[] = new Employee[num];
        for(int i = 0 ; i<num ; i++){
            int a = s.nextInt();
            s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt();
            s.nextLine();
            char d = s.next().charAt(0);
            s.nextLine();
            double e = s.nextDouble();
            s.nextLine();

            emp[i] = new Employee(a,b,c,d,e);

        }
        //second highest salary
        Employee secondLowest = getEmployeeWithSecondLowestSalary(emp);
        if(secondLowest != null){
            System.out.println("Employee with second lowest salary:  "+secondLowest.getemployeeId()+"#"+secondLowest.getemployeeName());
        }
        else{
            System.out.println("NULL");
        }


    }
    public static Employee getEmployeeWithSecondLowestSalary(Employee[] e) {
        if (e.length < 2) return null;
       
        double lowSal = e[0].getsal();
        
        for(int i = 1 ; i< e.length ; i++){
            if(lowSal > e[i].getsal()){
                lowSal = e[i].getsal();
            }
        }
        
        int no = 0;
        double secondLow = Integer.MAX_VALUE ;
        for(int i =0 ; i< e.length ;i++){
            if((lowSal != e[i].getsal())&&(secondLow > e[i].getsal())){
                secondLow = e[i].getsal();
                no = i;
            }
        }

        return e[no];
    }
    public static int countEmployeesBasedOnAge(Employee e[], int age){

    }
}