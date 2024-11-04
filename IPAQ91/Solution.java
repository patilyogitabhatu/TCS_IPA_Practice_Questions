import java.util.*;
class Student{
    private int rollNo;
    private String name, subject, date;
    private char grade;
    public Student(int rollNo, String name, String subject, char grade, String date){
        this.rollNo=rollNo;
        this.name=name;
        this.subject=subject;
        this.grade=grade;
        this.date=date;
    }
    public int getrollNo(){
        return rollNo;
    }
    public String getname(){
        return name;
    }
    public String getsubject(){
        return subject;
    }
    public char getgrade(){
        return grade;
    }
    public String getdate(){
        return date;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Student st[] = new Student[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            char d = s.nextLine().charAt(0);
            String e = s.nextLine();

            st[i]= new Student(a,b,c,d,e);
        }
        char grade = s.nextLine().charAt(0);
        int month = s.nextInt();

        Student ans[] = findStudentByGradeAndMonth(st,grade,month);
        if(ans != null){
            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getname());
                System.out.println(ans[i].getsubject());
            }
            System.out.println(ans.length);
        }
    }
    public static Student[] findStudentByGradeAndMonth(Student st[], char grade, int month){
        Student ans[] = new Student[0];

        for(int i=0 ; i<st.length ; i++){
            String c[] = st[i].getdate().split("/");
            if((st[i].getgrade()==grade) && (Integer.parseInt(c[1]) == month ) ){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1]=st[i];
            }
        }
        return ans;
    }
}