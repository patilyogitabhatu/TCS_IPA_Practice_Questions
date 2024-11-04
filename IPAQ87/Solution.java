import java.util.*;
class AutonomousCar{
    int carId, noOfTestsConducted, noOfTestsPassed ;
    String brand , environment, grade;

    public AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment, String grade){
        this.carId=carId;
        this.brand=brand;
        this.noOfTestsConducted=noOfTestsConducted;
        this.noOfTestsPassed=noOfTestsPassed;
        this.environment=environment;
        this.grade=grade;
    }
    public int getcid(){
        return carId;
    }
    public String getbrand(){
        return brand;
    }
    public int getTconduct(){
        return noOfTestsConducted;
    }
    public int getTpassed(){
        return noOfTestsPassed;
    }
    public String getenvironment(){
        return environment;
    }
    public String getgrade(){
        return grade;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        AutonomousCar at[] = new AutonomousCar[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();
            String e = s.nextLine();
            String rate ="";
            if(((d*100)/c) >= 80){
                rate = "A1";
            }else{
                rate = "B2";
            }
             

            at[i] = new AutonomousCar(a, b, c, d, e, rate);
        }
        String envi = s.nextLine();
        String brand = s.nextLine();

        int ans1 = findTestPassedByEnv(at,envi);
        if(ans1 !=0){
            System.out.println(ans1);
        }else{
            System.out.println("“There are no tests passed in this particular environment");
        }

        AutonomousCar ans2[]= updateCarGrade(at,brand);
        if(ans2 !=null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getbrand()+"::"+ans2[i].getgrade());
            }

        }else{
            System.out.println("No Car is available with the specified brand");
        }
    }
    public static int findTestPassedByEnv(AutonomousCar at[], String envi){
        int sum=0;
        for(int i=0 ; i <at.length ; i++){
            if(at[i].getenvironment().equalsIgnoreCase(envi)){
                sum +=at[i].noOfTestsPassed;
            }
        }
        return sum;
    }
    public static AutonomousCar[] updateCarGrade(AutonomousCar at[],String brand){
        AutonomousCar ans[] = new AutonomousCar[0];
        for(int i=0 ; i<at.length; i++){
            if(at[i].getbrand().equalsIgnoreCase(brand)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]= at[i];
            }
        }
        return ans;
    }
}
