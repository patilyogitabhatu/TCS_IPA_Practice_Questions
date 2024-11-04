import java.util.*;
class Movie{
    String movieName, company, genre;
    int budget;
    public Movie(String movieName, String company, String genre, int budget){
        this.movieName=movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }
    public String getmname(){
        return movieName;
    }
    public String getcompany(){
        return company;
    }
    public String getgenre(){
        return genre;
    }
    public int getbudget(){
        return budget;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Movie mov[] = new Movie[4];
        for(int i = 0 ; i<4 ; i++){
            String a = s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();

            mov[i] = new Movie(a,b,c,d);
        }
        String searchGenre = s.nextLine();
        Movie ans[]= getMovieByGenre(mov, searchGenre);
        if(ans != null){
            for(int i=0 ; i<ans.length ; i++){
                if(ans[i].getbudget() > 80000000){
                    System.out.println("High Budget Movie");
                }else{
                    System.out.println("Low Budget Movie");
                }
            }
        }
    }
    public static Movie[] getMovieByGenre(Movie m[], String g){
        Movie ans[] = new Movie[0];

        for(int i=0 ; i<m.length; i++){
            if(m[i].getgenre().equalsIgnoreCase(g)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = m[i];
            }
        }
        return ans;
    }
}