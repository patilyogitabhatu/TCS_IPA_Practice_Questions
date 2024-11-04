import java.util.*;
class College{
    private int id, contactNo, pinCode;
    private String name, address;

    public College(int id, String name, int contactNo, String address, int pinCode){
        this.id=id;
        this.name=name;
        this.contactNo=contactNo;
        this.address=address;
        this.pinCode=pinCode;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getNo(){
        return contactNo;
    }
    public String getaddress(){
        return address;
    }
    public int getpin(){
        return pinCode;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setno(int contactNo){
        this.contactNo=contactNo;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setpin(int pinCode){
        this.pinCode=pinCode;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        College clg[] = new College[no];

        for(int i=0 ; i<no ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            String d = s.nextLine();
            int e = s.nextInt(); s.nextLine();

            clg[i] = new College(a, b, c, d, e);
        }

        String address = s.nextLine();

        College ans1 = findCollegeWithMaximumPincode(clg);
        if(ans1 != null){
            System.out.println("id-"+ans1.getid());
            System.out.println("name-"+ans1.getname());
            System.out.println("contactNo-"+ans1.getNo());
            System.out.println("address-"+ans1.getaddress());
            System.out.println("pincode-"+ans1.getpin());
        }else{
            System.out.println("No college found with mentioned attribute");
        }

        College ans2[] = searchCollegeByAddress(clg, address);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println("id-"+ans2[i].getid());
                System.out.println("name-"+ans2[i].getname());
                System.out.println("contactNo-"+ans2[i].getNo());
                System.out.println("address-"+ans2[i].getaddress());
                System.out.println("pincode-"+ans2[i].getpin());
            }
        }else{
            System.out.println("No college found with mentioned attribute");
        }
    }
    public static College[] searchCollegeByAddress(College clg[], String address){
        College ans[] = new College[0];

        for(int i=0 ; i<clg.length ; i++){
            if(clg[i].getaddress().equalsIgnoreCase(address)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1]= clg[i];
            }
        }
        return ans;
    }
    public static College findCollegeWithMaximumPincode(College clg[]){
        int max = clg[0].getpin();

        for(int i=1 ; i<clg.length ; i++){
            max = Math.max(max, clg[i].getpin());
        }
        College temp=null;
        for(int i=0 ; i<clg.length ;i++){
            if(clg[i].getpin()==max){
                temp = clg[i];
            }
        }
        return temp;
    }
}