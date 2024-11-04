import java.util.*;
class Engine{
    private int engineId;
    private String engineName, engineType;
    private double enginePrice;

    public Engine(int engineId, String engineName, String engineType, double enginePrice){
        this.engineId=engineId;
        this.engineName=engineName;
        this.engineType=engineType;
        this.enginePrice=enginePrice;
    }
    public int getId(){
        return engineId;
    }
    public String getName(){
        return engineName;
    }
    public String getType(){
        return engineType;
    }
    public double getPrice(){
        return enginePrice;
    }
}
public class MyClass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Engine eg[] = new Engine[4];

        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            double d = s.nextDouble(); s.nextLine();

            eg[i] = new Engine(a,b,c,d);
        }
        String type = s.nextLine();
        String name = s.nextLine();

        double ans1 = findAvgEnginePriceByType(eg, type);
        if(ans1 !=0){
            System.out.println(ans1);
        }else{
            System.out.println("There are no engine with given type");
        }

        Engine ans2[] = searchEngineByName(eg, name);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getId());
            }
        }else{
            System.out.println("There are no engine with the given name");
        }
    }
    public static Engine[] searchEngineByName(Engine eg[], String name){
        Engine ans[] = new Engine[0];

        for(int i=0 ; i<eg.length ; i++){
            if(eg[i].getName().equalsIgnoreCase(name)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = eg[i];
            }
        }
        Engine temp;
        for(int i=0 ; i<ans.length ; i++){
            for(int j=i+1 ; j<ans.length ; j++){
                if(ans[i].getId() > ans[j].getId()){
                    temp = ans[j];
                    ans[j] = ans[i];
                    ans[i] = temp;
                }
            }
        }
        return ans;
    }
    public static double findAvgEnginePriceByType(Engine eg[], String type){
        int count =0;
        int sum = 0;
        for(int i=0 ; i<eg.length ; i++){
            if(eg[i].getType().equalsIgnoreCase(type)){
                count +=1;
                sum += eg[i].getPrice();
            }
        }
        return sum/count;
    }
}