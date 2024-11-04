import java.util.*;
class Inventory{
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;

    public Inventory(String inventoryId, int maximumQuantity, int currentQuantity, int threshold){
        this.inventoryId=inventoryId;
        this.maximumQuantity=maximumQuantity;
        this.currentQuantity=currentQuantity;
        this.threshold=threshold;
    }
    public String getId(){
        return inventoryId;
    }
    public int getmaxQ(){
        return maximumQuantity;
    }
    public int getcurrQ(){
        return currentQuantity;
    }
    public int getthreshold(){
        return threshold;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Inventory in[] = new Inventory[4];

        for(int i=0 ; i<4 ; i++){
            String a = s.nextLine();
            int b = s.nextInt(); s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();

            in[i] = new Inventory(a, b, c, d);
        }
        String limit = s.nextLine();
        Inventory ans[] = Replenish(in,limit);

        if(ans != null){
            for(int i=0 ; i<ans.length ; i++){
                if(ans[i].getthreshold()>75){
                    System.out.println(ans[i].getId()+" Critical Filling");
                }
                else if((ans[i].getthreshold()>50)&&(ans[i].getthreshold()<75)){
                    System.out.println(ans[i].getId()+" Moderate Filling");   
                }else{
                    System.out.println(ans[i].getId()+" Non-Critical Filling");
                }
            }
        }
    }
    public static Inventory[] Replenish(Inventory in[], String limit){
        Inventory ans[] = new Inventory[0];

        for(int i=0 ; i<in.length ; i++){
            if(Integer.parseInt(limit) >= in[i].getthreshold()){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = in[i];
            }
        }
        return ans;
    }
}