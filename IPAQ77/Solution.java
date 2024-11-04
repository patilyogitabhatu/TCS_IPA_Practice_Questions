import java.util.*;
class Student{
    private int rollNo;
    private String name, branch;
    private double score;
    private boolean dayScholar;

    public Student(int rollNo, String name, String branch, double score, boolean dayScholar){
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
        this.score=score;
        this.dayScholar=dayScholar;
    }
    public int getrollno(){
        return rollNo;
    }
    public String getname(){
        return name;
    }
    public String getbranch(){
        return branch;
    }
    public double getscore(){
        return score;
    }
    public boolean getdayScholar(){
        return dayScholar;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Student st[] = new Student[4];
        for(int i=0 ; i<4 ;i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            double d = s.nextDouble(); s.nextLine();
            boolean e = s.nextBoolean(); s.nextLine();

            st[i] = new Student(a, b, c, d, e);
        }

        int ans1 = findCountOfDayscholarStudents(st);
        if(ans1 != 0){
            System.out.println(ans1);
        }else{
            System.out.println("There are no such dayscholar students");
        }

        Student ans2[] = findStudentwithSecondHighestScore(st);
        if(ans2 != null){
            System.out.println(ans2[1].getrollno()+"#"+ans2[1].getname()+"#"+ans2[1].getscore());
        }else{
            System.out.println("There are no student from non day scholar");
        }

    }
    public static Student[] findStudentwithSecondHighestScore(Student st[]){
        Student ans[] = new Student[0];
        for(int i=0 ; i<st.length ;i++){
            if(!st[i].getdayScholar()){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = st[i];
            }
        }
        if(ans != null){
            for(int i=0 ; i<ans.length-1 ; i++){
                for(int j=i+1 ; j<ans.length ; j++){
                    if(ans[i].getscore()<ans[j].getscore()){
                        Student temp = ans[i];
                        ans[i]=ans[j];
                        ans[j]=temp;
                    }
                }
            }
            return ans;
        }
        return null;      
    
    }
    public static int findCountOfDayscholarStudents(Student st[]){
        int ans=0;
        for(int i=0 ;i<st.length ; i++){
            if(st[i].getscore()>80 && st[i].getdayScholar()==true){
                ans +=1;
            }
        }
        return ans;
    }
}