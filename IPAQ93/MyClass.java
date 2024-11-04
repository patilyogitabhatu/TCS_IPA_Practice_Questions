import java.util.*;
class Flower{
    private int flowerId, price, rating;
    private String flowerName, type;
    public Flower(int flowerId, String flowerName, int price, int rating, String type){
        this.flowerId=flowerId;
        this.flowerName=flowerName;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }
    public int getid(){
        return flowerId;
    }
    public String getname(){
        return flowerName;
    }
    public int getprice(){
        return price;
    }
    public int getrating(){
        return rating;
    }
    public String gettype(){
        return type;
    }
}
public class MyClass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Flower flow[] = new Flower[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();
            String e = s.nextLine();

            flow[i] = new Flower(a,b,c,d,e);
        }

        String type = s.nextLine();

        int ans = findMinPriceByType(flow, type);
        if(ans !=0){
            System.out.println(ans);

        }else{
            System.out.println("There is no flower with given type");
        }
    }
    public static int findMinPriceByType( Flower flow[], String type){
        Flower ans[] = new Flower[0];

        for(int i=0 ; i<flow.length ; i++){
            if((flow[i].gettype().equalsIgnoreCase(type)) && (flow[i].getrating()>3) ){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = flow[i];
            }
        }
        if(ans.length > 0){
            Flower min = ans[0];
            for(int i=1 ; i<ans.length ; i++){
                if(min.getprice() > ans[i].getprice()){
                    min = ans[i];
                }
            }
            return min.getid();
        }
        return 0;
        
        
    }
}