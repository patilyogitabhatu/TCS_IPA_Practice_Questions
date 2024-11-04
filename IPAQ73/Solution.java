import java.util.*;
class newspaper{
    int regNo, publicationYear, price;
    String name;
    public newspaper(int regNo, String name, int publicationYear, int price){
        this.regNo=regNo;
        this.name=name;
        this.publicationYear=publicationYear;
        this.price=price;
    }
    public int getNo(){
        return regNo;
    }
    public String getname(){
        return name;
    }
    public int getyear(){
        return publicationYear;
    }
    public int getprice(){
        return price;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        newspaper news[] = new newspaper[4];

        for(int i=0 ; i<4 ;i++){
            int a =s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();
    
            news[i] = new newspaper(a,b,c,d);
        }
        int year = s.nextInt(); s.nextLine();
        String name = s.nextLine();

        int ans1= findTotalPriceByPublicationYear(news, year);
        if(ans1 !=0){
            System.out.println(ans1);
        }else{
            System.out.println("No Newspaper found with the mentioned attribute.");
        }

        newspaper ans2[] = findTotalPriceByPublicationYear(news, name);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println("regNo-"+ans2[i].getNo());
                System.out.println("name-"+ans2[i].getname());
                System.out.println("publicationYear-"+ans2[i].getyear());
                System.out.println("price-"+ans2[i].getprice());
            }
        }else{
            System.out.println("No Newspaper found with the given name.");
        }

    }
    public static newspaper[] findTotalPriceByPublicationYear(newspaper news[], String name){
        newspaper ans[]= new newspaper[0];
        for(int i=0 ; i<news.length ; i++){
            if(news[i].getname().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = news[i];
            }
        }
        return ans;
    }
    public static int findTotalPriceByPublicationYear(newspaper news[], int year){
        int ans=0;
        for(int i=0 ; i<news.length ; i++){
            if(year == news[i].getyear()){
                ans +=news[i].getprice();
            }
        }
        return ans;
    }
}