import java.util.*;
class Footwear{
    private int footwearId, price;
    private String footwearName, footwearType;

    public Footwear(int footwearId, String footwearName, String footwearType, int price){
        this.footwearId=footwearId;
        this.footwearName=footwearName;
        this.footwearType=footwearType;
        this.price=price;
    }
    public int getid(){
        return footwearId;
    }
    public String getname(){
        return footwearName;
    }
    public String gettype(){
        return footwearType;
    }
    public int getprice(){
        return price;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Footwear fot[] = new Footwear[5];
        for(int i=0 ; i<5 ;i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();

            fot[i] = new Footwear(a,b,c,d);
        }
        String type = s.nextLine();
        String name = s.nextLine();
        int ans1 = getCountByType(fot,type);
        if(ans1 !=0){
            System.out.println(ans1);
        }else{
            System.out.println("Footwear not available");
        }

        Footwear ans2[] = getSecondHighestPriceByBrand(fot,name);
        if(ans2 != null){
            System.out.println(ans2[1].getid());
            System.out.println(ans2[1].getname());
            System.out.println(ans2[1].getprice());

        }else{
            System.out.println("Brand not available");
        }
    }
    public static Footwear[] getSecondHighestPriceByBrand(Footwear fot[],String  name){
        Footwear ans[] = new Footwear[0];
        for(int i=0 ; i<fot.length ; i++){
            if(fot[i].getname().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = fot[i];
            }
        }

        if(ans != null){
            for(int i=0 ; i<ans.length-1 ; i++){
                for(int j=i+1 ; j<ans.length ; j++){
                    if(ans[i].getprice() < ans[j].getprice()){
                        ans[i] = ans[j];
                    }
                }
            }
            return ans;
        }
        return null;
    }

    public static int getCountByType( Footwear fot[],String type){
        int ans=0;
        for(int i=0 ; i<fot.length ; i++){
            if(fot[i].gettype().equalsIgnoreCase(type)){
                ans +=1;
            }
        }
        return ans;
    }
}