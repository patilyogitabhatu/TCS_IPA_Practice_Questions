import java.util.*;
class Fruits{
    private int fruitId, price, rating;
    private String fruitName;

    public Fruits(int fruitId, String fruitName, int price, int rating){
        this.fruitId=fruitId;
        this.fruitName=fruitName;
        this.price=price;
        this.rating=rating;
    }
    public int getId(){
        return fruitId;
    }
    public String getName(){
        return fruitName;
    }
    public int getPrice(){
        return price;
    }
    public int getrating(){
        return rating;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Fruits ft[] = new Fruits[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();

            ft[i] = new Fruits(a,b,c,d);
        }
        int rate = s.nextInt();

        int ans = findMaximumPriceByRating(ft,rate);
        if(ans != 0){
            System.out.println(ans);
        }else{
            System.out.println("No such Fruit");
        }
    }
    public static int findMaximumPriceByRating(Fruits ft[], int rate){
        int max = 0;
        int maxi = -1;
        for(int i=0 ; i<ft.length ; i++){
            if(ft[i].getrating() > rate){
                if(ft[i].getPrice() > max){
                    max = ft[i].getPrice();
                    maxi=i;
                }
            }
        }
        return ft[maxi].getId();
    }
}