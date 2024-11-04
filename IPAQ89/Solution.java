import java.util.*;
class Phone{
    int phoneId, price;
    String os, brand;

    public Phone(int phoneId, String os, String brand, int price){
        this.phoneId=phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
    public int getphoneid(){
        return phoneId;
    }
    public String getos(){
        return os;
    }
    public String getbrand(){
        return brand;
    }
    public int getprice(){
        return price;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Phone ph[] = new Phone[4];

        for(int i= 0 ; i<ph.length ; i++){
            int a=s.nextInt(); s.nextLine();
            String b=s.nextLine();
            String c=s.nextLine();
            int d=s.nextInt();
            s.nextLine();

            ph[i]= new Phone(a, b, c, d);
        }
        String brand= s.nextLine();
        String os = s.nextLine();
        int ans1 = findPriceForGivenBrand(ph,brand);
        if(ans1>0){
            System.out.println(ans1);
        }else{
            System.out.println("The given Brand is not available");
        }

        Phone ans2[] = getPhoneIdBasedOnOs(ph,os);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getphoneid());
            }
        }else{
            System.out.println("No phones are available with specified os and price range");
        }

    }
    public static int findPriceForGivenBrand(Phone[] ph, String brand){
        int sum=0;
        for(int i=0 ; i<ph.length ;i++){
            if(ph[i].getbrand().equalsIgnoreCase(brand)){
                sum += ph[i].getprice();
            }
        }
        return sum;
    }
    public static Phone[] getPhoneIdBasedOnOs(Phone ph[], String os){
        Phone ans[] = new Phone[0];
        for(int i=0 ; i<ph.length ; i++){
            if(ph[i].getos().equalsIgnoreCase(os) && ph[i].getprice() >= 50000){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]= ph[i];
            }
        }
        return ans;
    }
}