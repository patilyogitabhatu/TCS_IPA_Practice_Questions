import java.util.*;
class Cinema{
    int movieId, rating, budget;
    String director;

    public Cinema(int movieId, String director, int rating, int budget){
        this.movieId=movieId;
        this.director=director;
        this.rating=rating;
        this.budget=budget;
    }
    public int getId(){
        return movieId;
    }
    public String getDirector(){
        return director;
    }
    public int getRate(){
        return rating;
    }
    public int getBudget(){
        return budget;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Cinema ci[] = new Cinema[4];

        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            int c = s.nextInt(); s.nextLine();
            int d = s.nextInt(); s.nextLine();

            ci[i]= new Cinema(a, b, c, d);
        }
        String director = s.nextLine();
        int rate = s.nextInt(); s.nextLine();
        int budget = s.nextInt(); s.nextLine();

        int ans1 = findAvgBudgetByDirector(ci, director);
        if(ans1 !=0){
            System.out.println(ans1);

        }else{
            System.out.println("Sorry - The given director has not yet directed any movie");
        }

        Cinema ans2[] = getMovieByRatingBudget(ci,rate,budget);
        if(ans2 != null){
            for(int i=0 ;i<ans2.length ; i++){
                System.out.println(ans2[i].getId());
            }
        }else{
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
        }
    }
    public static Cinema[] getMovieByRatingBudget(Cinema ci[], int rate, int budget){
        Cinema ans[] = new Cinema[0];
        for(int i=0 ; i<ci.length ; i++){
            if((ci[i].getRate()==rate) && (ci[i].getBudget()==budget) && (budget%rate==0)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = ci[i];
            }
        }
        return ans;
    }
    public static int findAvgBudgetByDirector(Cinema ci[], String director){
        int sum=0;
        int count=0;

        for(int i=0 ; i<ci.length ; i++){
            if(ci[i].getDirector().equalsIgnoreCase(director)){
                sum += ci[i].getBudget();
                count +=1;
            }
        }
        return sum/count;
    }
}