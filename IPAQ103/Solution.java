import java.util.*;
class Vegetable{
    private int VegetableId, Price, Rating;
    private String VegetableName;

    public Vegetable(int VegetableId, String VegetableName, int Price, int Rating){
        this.VegetableId=VegetableId;
        this.VegetableName=VegetableName;
        this.Price=Price;
        this.Rating=Rating;

    }
    public int getId(){
        return VegetableId;
    }
    public String getName(){
        return VegetableName;
    }
    public int getPrice(){
        return Price;
    }
    public int getRating(){
        return Rating;
    }
    public void setId(int VegetableId){
        this.VegetableId=VegetableId;
    }
    public void setName(String VegetableName){
        this.VegetableName=VegetableName;
    }
    public void setPrice(int Price){
        this.Price=Price;
    }
    public void setRating(int Rating){
        this.Rating=Rating;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Vegetable veg[] = new Vegetable[4];

        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine(); 
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();

            veg[i] = new Vegetable(a, b, c, d);
        }
        int rate = s.nextInt();
        Vegetable ans[] = findMinimumPriceByRating(veg, rate);
        if(ans !=null){
            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getId());
            }
        }else{
            System.out.println("No such Vegetable");
        }
    }
    public static Vegetable[] findMinimumPriceByRating(Vegetable veg[], int rate){
        int minp = Integer.MAX_VALUE;
        for(int i=0 ; i<veg.length ; i++){
            if(veg[i].getRating() > rate){
                minp = Math.min(minp,veg[i].getPrice());
            }
        }
        Vegetable ans[] = new Vegetable[0];
        for(int i=0 ; i<veg.length ; i++){
            if(veg[i].getPrice() == minp){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = veg[i];
            }
        }
        return ans;
    }
}