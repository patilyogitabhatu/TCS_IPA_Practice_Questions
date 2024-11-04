import java.util.*;
class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId,String courseName, String courseAdmin, int quiz, int handson){
        this.courseId = courseId;
        this.courseName= courseName;
        this.courseAdmin=courseAdmin;
        this.quiz = quiz;
        this.handson=handson;
    }
    public int getcid(){
        return courseId;
    }
    public String getcname(){
        return courseName;
    }
    public String getcadmin(){
        return courseAdmin;
    }
    public int getquiz(){
        return quiz;
    }
    public int gethandson(){
        return handson;
    }

}

public class Solution{
    public static void main(String args[]){
       Scanner s = new Scanner(System.in);

       Course cr[] = new Course[4];
       for(int i = 0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt() ; s.nextLine();
            int e = s.nextInt(); s.nextLine();

            cr[i] = new Course(a,b,c,d,e);
       } 
       String nameAdmin = s.nextLine();
       int handon = s.nextInt(); 
       
       int avg = findAvgOfQuizByAdmin(cr, nameAdmin);
       if(avg !=0){
            System.out.println(avg);
       }else{
            System.out.println("No Course found");
       }

       
       
       Course ans[] = sortCourseByHandsOn(cr, handon);
       if(ans != null){
            for(int i = 0 ; i<ans.length ; i++){
                System.out.println(ans[i].getcname());
            }
       }
       else{
        System.out.println("No Course found with mentioned attributes.");
       }
    }
    public static int findAvgOfQuizByAdmin(Course cr[], String name){
        int sum = 0;
        int count = 0;

        for(int i = 0 ; i<cr.length ; i++){
            if(cr[i].getcadmin().equalsIgnoreCase(name)){
                sum += cr[i].getquiz();
                count +=1;
            }
        }
        
        if(count > 0){
            int avg = sum/count;
            return avg;
        }else{
            return 0;
        }

    }
    public static Course[] sortCourseByHandsOn(Course cr[], int hand){
        
        Course cobj[] = new Course[0];
        for(int i = 0 ;i<cr.length ; i++){
            if(cr[i].gethandson() < hand){
                cobj = Arrays.copyOf(cobj, cobj.length+1);
                cobj[cobj.length-1] = cr[i];
            }
        }

        Course temp ; 
        for(int i=0 ; i<cobj.length-1 ; i++){
            if(cobj[i].gethandson() > cobj[i+1].gethandson()){
                temp = cobj[i];
                cobj[i] = cobj[i+1];
                cobj[i+1] = temp;
            }
        }
        if(cobj.length>0){
            return cobj;
        }else{
            return null;
        }
    }
}