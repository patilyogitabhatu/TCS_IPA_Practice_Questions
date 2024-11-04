import java.util.*;
class Mobile{
    private int MobileId, Price;
    private String Brand;
    private boolean isFlagShip;

    public Mobile(int MobileId, int Price, String Brand, boolean isFlagShip){
        this.MobileId=MobileId;
        this.Price=Price;
        this.Brand=Brand;
        this.isFlagShip=isFlagShip;
    }
    public int getId(){
        return MobileId;
    }
    public int getprice(){
        return Price;
    }
    public String getbrand(){
        return Brand;
    }
    public boolean getisflagship(){
        return isFlagShip;
    }
}
public class MobileDetail{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Mobile mob[] = new Mobile[5];
        for(int i=0 ; i<5 ; i++){
            int a = s.nextInt(); s.nextLine();
            int b = s.nextInt(); s.nextLine();
            String c = s.nextLine();
            boolean d = s.nextBoolean(); s.nextLine();

            mob[i] = new Mobile(a,b,c,d);
        }
        String brand = s.nextLine();

        int ans1 = getTotalPrice(mob,brand);
        if(ans1 != 0){
            System.out.println(ans1);
        }else{
            System.out.println("There are no Mobile with given brand");
        }

        Mobile ans2[] = getSecondMin(mob);
        if(ans2 !=null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getbrand()+" : "+ans2[i].getprice());
            }
        }

    }
    public static Mobile[] getSecondMin(Mobile mob[]){
        int min1st = Integer.MAX_VALUE;
        for(int i=0; i<mob.length ; i++){
            min1st = Math.min(min1st, mob[i].getprice());
        }
        int min2nd = Integer.MAX_VALUE;

        for(int j=0 ; j<mob.length ; j++){
            if(min1st != mob[j].getprice()){
                min2nd = Math.min(min2nd, mob[j].getprice());
            }
        }
        // System.out.println(min1nd);
        Mobile ans[] = new Mobile[0];
        for(int i=0 ; i<mob.length ; i++){
            if(mob[i].getprice()==min2nd){
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = mob[i];
            }
        }
        return ans;

    }
    public static int getTotalPrice(Mobile mob[], String brand){
        int sum =0;
        for(int i=0 ; i<mob.length ; i++){
            if(mob[i].getbrand().equalsIgnoreCase(brand)){
                sum += mob[i].getprice();
            }
        }
        return sum;
    }
}