import java.util.*;
class Medicine{
    String MedicineName , batch, disease;
    int price;
    public Medicine(String MedicineName, String batch, String disease, int price){
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
    public String getMName(){
        return MedicineName;
    }
    public String getBatch(){
        return batch;
    }
    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Medicine med[] = new Medicine[4];

        for(int i=0 ; i<4 ; i++){
            String a = s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt();
            s.nextLine();

            med[i] = new Medicine(a,b,c,d);
        }

        String dis = s.nextLine();
        Medicine ans1[] = getPriceByDisease(med, dis);
        if(ans1!= null){
            for(int i = 0 ; i<ans1.length ; i++){
                System.out.println(ans1[i].getPrice());
            }
        }else{
            System.out.println("Not Found");
        }
    }
    public static Medicine[] getPriceByDisease(Medicine med[], String dis){
        Medicine ans[] = new Medicine[0];
        for(int i = 0; i<med.length; i++){
            if(med[i].getDisease().equalsIgnoreCase(dis)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = med[i];
            }
        }
        if(ans !=null){
            Medicine temp = null;
            for(int i = 0 ; i<ans.length-1 ; i++){
                if(ans[i].getPrice()>ans[i+1].getPrice()){
                    temp = ans[i];
                    ans[i] = ans[i+1];
                    ans[i+1] = temp;
                }
            }
            return ans;
        }else{
            return null;
        }
    }
}