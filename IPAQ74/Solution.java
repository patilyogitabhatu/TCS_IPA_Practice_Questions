import java.util.*;
class TravelAgencies{
   int regNo, price;
   String agencyName, packageType;
   boolean flightFacility;
   
   public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility){
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
   }
   public int getregNo(){
    return regNo;
   }
   public String getName(){
    return agencyName;
   }
   public String getType(){
    return packageType;
   }
   public int getPrice(){
    return price;
   }
   public boolean getfacility(){
    return flightFacility;
   }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        TravelAgencies tr[] = new TravelAgencies[4];

        for(int i=0 ; i<tr.length ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();
            boolean e = s.nextBoolean(); s.nextLine();

            tr[i] = new TravelAgencies(a, b, c, d, e);
        }
        
        int regNo = s.nextInt() ; s.nextLine();
        String packageType = s.nextLine();

        int ans1= findAgencyWithHighestPackagePrice(tr);
        System.out.println(ans1);
        
        TravelAgencies ans2[] = agencyDetailsForGivenldAndType(tr, regNo, packageType);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getName()+":"+ans2[i].getPrice());
            }
        }

    }
    public static TravelAgencies[] agencyDetailsForGivenldAndType(TravelAgencies tr[], int regNo, String packageType){
        TravelAgencies ans[] = new TravelAgencies[0];
        for(int i=0 ; i<tr.length ; i++){
            if((regNo==tr[i].getregNo()) && (packageType.equalsIgnoreCase(tr[i].getType()))&&(tr[i].getfacility()==true)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = tr[i];
            }
        }
        return ans;
    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies tr[]){
        int ans = tr[0].getPrice();
        for(int i=1 ; i<tr.length ;i++){
            ans = Math.max(ans, tr[i].getPrice());
            if(ans<tr[i].getPrice()){
                ans = tr[i].getPrice();
            }
        }
        return ans;
    }
}