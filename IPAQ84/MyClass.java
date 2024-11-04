import java.util.*;
class Employee{
    private int employeeId ;
    private  String name, branch;
    private double rating;
    private boolean companyTransport;

    public Employee(int employeeId, String name, String branch, double rating, boolean companyTransport) {
        this.employeeId=employeeId;
        this.name=name;
        this.branch=branch;
        this.rating=rating;
        this.companyTransport=companyTransport;
    }
    public int getId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public String getbranch(){
        return branch;
    }
    public double getrate(){
        return rating;
    }
    public boolean getcTransport(){
        return companyTransport;
    }    
    
}
public class MyClass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Employee emp[] = new Employee[4];

        for(int i= 0 ; i<4 ; i++){
            int a = s.nextInt();
            s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            Double d = s.nextDouble();
            s.nextLine();
            Boolean e = s.nextBoolean();
            s.nextLine();

            emp[i] = new Employee(a,b,c,d,e);
        }
        String name= s.nextLine();
        int count = findCountOfEmployeesUsingCompTransport(emp,name);
        if(count !=0){
            System.out.println(count);
        }else{
            System.out.println("No such Employees");
        }

        Employee[] temp = findEmployeeWithSecondHighestRating(emp);
        if(temp != null){
                System.out.println(temp[1].getId());
                System.out.println(temp[1].getName());
            
        }else
        {
            System.out.println("All Employees using company transport");
        }
    }
    public static int findCountOfEmployeesUsingCompTransport(Employee e[], String name){
        int count = 0;
        for(int i=0 ; i<e.length; i++){
            if(e[i].getbranch().equals(name) && e[i].getcTransport()==true){
                count +=1;
            }
        }
        return count;
    }
    public static Employee[] findEmployeeWithSecondHighestRating(Employee e[]){

        Employee emp[] = new Employee[0];
        for(int i=0 ; i<e.length;i++){
            if(e[i].getcTransport()==false){
                emp = Arrays.copyOf(emp,emp.length+1);
                emp[emp.length-1] = e[i];
            }
        }
        if(emp != null){
            Employee temp;
            for(int i=0 ; i<emp.length-1 ;i++){
                if(emp[i].getrate() < emp[i+1].getrate()){
                    temp = emp[i];
                    emp[i] = emp[i+1];
                    emp[i+1] = temp;
                }
            }
            if(emp.length>0){
                return emp;
            }
            else{
                return null;
            }
        }else{
            return null;
        }
    }
}