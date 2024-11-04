import java.util.*;
class Car{
    private String make, model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public String getmake(){
        return make;
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }
    public double getprice(){
        return price;
    }
    public void setmake(String make){
        this.make=make;
    }
    public void setmodel(String model){
        this.model=model;
    }
    public void setyear(int year){
        this.year=year;
    }
    public void setprice(double price){
        this.price=price;
    }   
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Car car[] = new Car[4];

        for(int i=0 ; i<4 ; i++){
            String a = s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt();
            double d = s.nextDouble(); s.nextLine();

            car[i] = new Car(a, b, c, d);
        }
        String make = s.nextLine();
        String model = s.nextLine();

        Car ans1 = findMostExpensiveCar(car);
        if(ans1 != null){
            System.out.println(ans1.getmake());
            System.out.println(ans1.getmodel());
            System.out.println(ans1.getyear());
            System.out.println(ans1.getprice());
        }else{
            System.out.println("Sorry - No car is available");
        }

        Car ans2 = getCarByMakeAndModel(car,make,model);
        if(ans2 != null){
            System.out.println(ans2.getyear());
            System.out.println(ans2.getprice());
        }else{
            System.out.println("Sorry - No car is available");
        }

    }
    public static Car getCarByMakeAndModel(Car car[], String make, String model){
        for(int i=0 ; i<car.length ; i++){
            if((car[i].getmake().equalsIgnoreCase(make))&&(car[i].getmodel().equalsIgnoreCase(model))){
                return car[i];
            }
        }
        return null;
    }
    public static Car findMostExpensiveCar(Car car[]){
        Car ans = car[0];
        for(int i=1 ; i<car.length ; i++){
            if(ans.getprice()<car[1].getprice()){
                ans = car[i];
            }
        }
        return ans;
    }
}