import java.util.*;
class Institution{
    int institutionId, noOfStudentsPlaced, noOfStudentsCleared;
    String institutionName, location, grade;

    public Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location, String grade){
        this.institutionId=institutionId;
        this.institutionName=institutionName;
        this.noOfStudentsPlaced=noOfStudentsPlaced;
        this.noOfStudentsCleared=noOfStudentsCleared;
        this.location=location;
        this.grade=grade;
    }
    public int getId(){
        return institutionId;
    }
    public String getName(){
        return institutionName;
    }
    public int getPlacedNo(){
        return noOfStudentsPlaced;
    }
    public int getclearedNo(){
        return noOfStudentsCleared;
    }
    public String getLocation(){
        return location;
    }
    public String getGrade(){
        return grade;
    }

}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Institution in[] = new Institution[4];

        for(int i=0 ; i<4 ;i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt() ; s.nextLine();
            String e = s.nextLine();

            int rating=(c * 100)/d;


            String f ;
            if(rating >=80 ){
                f = "A";
            }else{
                f = "B";
            }
            in[i] = new Institution(a,b,c,d,e,f);
        }
        String location = s.nextLine();
        String name = s.nextLine();
        int ans1 = FindNumClearancedByLoc(in , location);
        if(ans1 != 0){
            System.out.println(ans1);
        }else{
            System.out.println("\"There are no cleared students in this particular location");
        }

        Institution ans2[] =UpdateInstitutionGrade(in,name);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getName()+"::"+ans2[i].getGrade());
            }

        }else{
            System.out.println("No Institute is available with the specified name");
        }
    }
    public static Institution[] UpdateInstitutionGrade(Institution in[], String name){
        Institution ans[] = new Institution[0];
        for(int i=0 ; i<in.length ; i++){
            if(in[i].getName().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = in[i];
            }
        }
        return ans;

    }
    public static int FindNumClearancedByLoc(Institution in[], String location){
        int sum=0;
        for(int i=0 ; i<in.length ; i++){
            if(in[i].getLocation().equalsIgnoreCase(location)){
                sum += in[i].getclearedNo();
            }
        }
        return sum;
    }
}