import java.util.*;
class Person{
    String firstName, lastName;
    int age;
    char gender;
    Person(String firstName, String lastName, int age, char gender){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.gender=gender;
    }
    public String getfname(){
        return firstName;
    }
    public String getlname(){
        return lastName;
    }
    public int getage(){
        return age;
    }
    public char getgender(){
        return gender;
    }
    public void sefname(String firstName){
        this.firstName=firstName;
    }
    public void setlname(String lastName){
        this.lastName=lastName;
    }
    public void setage(int age){
        this.age=age;
    }
    public void setgender(char gender){
        this.gender=gender;
    }
}
class Student extends Person{
    String rollNo, course;
    int semester;
    double GPA;
    public Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA){
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA=GPA;
    }
    public String getrollno(){
        return rollNo;
    }
    public String getcourse(){
        return course;
    }
    public int getsemester(){
        return semester;
    }
    public double getgpa(){
        return GPA;
    }
    public void setrollno(String rollNo){
        this.rollNo=rollNo;
    }
    public void setcourse(String course){
        this.course=course;
    }
    public void setsemester(int semester){
        this.semester=semester;
    }
    public void setgpa(double GPA){
        this.GPA=GPA;
    }
}
class Faculty extends Person{
    String employeeId, department, designation;
    double salary;
    public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary){
        super(firstName, lastName, age, gender);
        this.employeeId=employeeId;
        this.department=department;
        this.designation= designation;
        this.salary=salary;
    }
    public String getempid(){
        return employeeId;
    }
    public String getdept(){
        return department;
    }
    public String getdesig(){
        return designation;
    }
    public double getsal(){
        return salary;
    }
    public void setempid(String employeeId){
        this.employeeId=employeeId;
    }
    public void setdept(String department){
        this.department=department;
    }
    public void setdesig(String designatiom){
        this.designation=designation;
    }
    public void setsal(double salary){
        this.salary=salary;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Student st[] = new Student[2];
        for(int i=0 ; i<2 ; i++){
            String a = s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            char d = s.nextLine().charAt(0);
            String e = s.nextLine();
            String f = s.nextLine();
            int g = s.nextInt(); s.nextLine();
            double h = s.nextDouble(); s.nextLine();
            
            st[i] = new Student(a,b,c,d,e,f,g,h);
        }
        
        Faculty ft[] = new Faculty[2];
        for(int i=0 ; i<2 ; i++){
            String a = s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            char d = s.nextLine().charAt(0);
            String e = s.nextLine();
            String f = s.nextLine();
            String g = s.nextLine();
            double h = s.nextDouble(); s.nextLine();
            
            ft[i] = new Faculty(a,b,c,d,e,f,g,h);
        }
        Student ans1 = findHighestGPAStudent(st);
        if(ans1 != null){
            System.out.println(ans1.getrollno());
            System.out.println(ans1.getcourse());
            System.out.println(ans1.getgpa());
        }else{
            System.out.println("Sorry - No student is available");
        }
        
        Faculty ans2 = findHighestPaidFaculty(ft);
        if(ans2 != null){
            System.out.println(ans2.getempid());
            System.out.println(ans2.getdept());
            System.out.println(ans2.getsal());
        }else{
            System.out.println("Sorry - No faculty is available");
        }
    }
    public static Student findHighestGPAStudent(Student st[]){
        Student hightgps = st[0];
        for(Student s: st){
            if(s.getgpa() >  hightgps.getgpa()){
                hightgps = s;
            }
        }
        return hightgps;
    }
    public static Faculty findHighestPaidFaculty(Faculty ft[]){
        Faculty highpaid = ft[0];
        for(Faculty f : ft){
            if(f.getsal() > highpaid.getsal()){
                highpaid = f;
            }
        }
        return highpaid;

    }
}







