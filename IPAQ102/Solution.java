import java.util.*;
class HeadSets{
    private String headsetName, brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available){
        this.headsetName=headsetName;
        this.brand=brand;
        this.price=price;
        this.available=available;
    }
    public void setname(String headsetName){
        this.headsetName=headsetName;
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public void setprice(int price){
        this.price=price;
    }
    public void setavailable(boolean available){
        this.available=available;
    }
    public String getname(){
        return headsetName;
    }
    public String getbrand(){
        return brand;
    }
    public int getprice(){
        return price;
    }
    public boolean getavailable(){
        return available;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        HeadSets hs[] = new HeadSets[4];

        for(int i=0 ; i<4 ; i++){
            String a = s.nextLine();
            String b = s.nextLine();
            int c =s.nextInt(); s.nextLine();
            boolean d = s.nextBoolean(); s.nextLine();

            hs[i] = new HeadSets(a,b,c,d);
        }
        String brand = s.nextLine();

        int ans1 = findTotalPriceForGivenBrand(hs, brand);
        if(ans1 != 0){
            System.out.println(ans1);
        }else{
            System.out.println("No Headsets available with the given brand");
        }

        HeadSets ans2[] = findAvailableHeadsetWithSecondMinPrice(hs);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getname());
                System.out.println(ans2[i].getprice());
            }
        }else{
            System.out.println("No Headsets available");
        }
    }
    public static HeadSets[] findAvailableHeadsetWithSecondMinPrice(HeadSets hs[]){
        int min1 = Integer.MAX_VALUE;

        for(int i=0 ; i<hs.length ; i++){
            min1 = Math.min(min1,hs[i].getprice());
        }

        int min2 = Integer.MAX_VALUE;

        for(int i=0 ; i<hs.length ; i++){
            if(hs[i].getprice() != min1){
                min2 = Math.min(min2,hs[i].getprice());
            }
        }

        HeadSets ans[] = new HeadSets[0];
        for(int i=0 ; i<hs.length ; i++){
            if(hs[i].getprice() == min2){
                ans =Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = hs[i];
            }
        }
        return ans;
    }
    public static int findTotalPriceForGivenBrand(HeadSets hs[], String brand){
        int sum=0 ;
        for(int i=0 ; i<hs.length ; i++){
            if(hs[i].getbrand().equalsIgnoreCase(brand)){
                sum += hs[i].getprice();
            }
        }
        return sum;
    }
}