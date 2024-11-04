import java.util.*;
class Car{
    private int carId;
    private String carName, fuelType;

    public Car(int carId, String carName, String fuelType){
        this.carId=carId;
        this.carName=carName;
        this.fuelType=fuelType;
    }
    public int getId(){
        return carId;
    }
    public String getName(){
        return carName;
    }
    public String getType(){
        return fuelType;
    }
}
public class RemoveCar{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Car car[] = new Car[5];
        for(int i=0 ; i<5 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();

            car[i] = new Car(a, b, c);
        }
        int id = s.nextInt();

        Car ans[] = RemoveAndRearrange(car,id);
        if(ans != null){
            for(int i=0 ; i<ans.length ; i++){
                System.out.println(ans[i].getId()+" : "+ans[i].getName());
            }
        }else{
            System.out.println("There are no car with given id");
        }
    }
    public static Car[] RemoveAndRearrange(Car car[], int id){
        Car ans[] = new Car[0];
        for(int i=0 ; i<car.length ; i++){
            if(car[i].getId() != id){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = car[i];
            }
        }
        return ans;
    }
}