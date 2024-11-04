import java.util.*;
class Song{
    private int songId;
    private String title , artist;
    private double duration;
    
    public Song(int songId, String title, String artist, double duration ){
        this.songId=songId;
        this.title=title;
        this.artist =artist;
        this.duration=duration;
    }
    public int getId(){
        return songId;
    }
    public void setId(int songId){
        this.songId=songId;
    }
    public String gettitle(){
        return title;
    }
    public void settitle(String title){
        this.title=title;
    }
    public String getartist(){
        return artist;
    }
    public void setartist(String artist){
        this.artist=artist;
    }
    public double getduration(){
        return duration;
    }
    public void setduration(double  duration){
        this.duration=duration;
    }
}
public class MyClass{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Song so[] = new Song[5];
        for(int i=0 ; i<5 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            double d = s.nextDouble(); s.nextLine();

            so[i] = new Song(a,b,c,d);
        }
        String artist = s.nextLine(); 
        String artist1 = s.nextLine();

        double ans1= findSongDurationForArtist(so,artist);
        if(ans1 != 0){
            System.out.println(ans1);
        }else{
            System.out.println("There are no songs with given artist");
        }

        Song ans2[] = getSongsInAscendingOrder(so,artist1);
        if(ans2 != null){
            for(int i=0 ; i<ans2.length ; i++){
                System.out.println(ans2[i].getId());
                System.out.println(ans2[i].gettitle());
            }
        }else{
            System.out.println("There are no songs with given artist");
        }

    }
    public static Song[] getSongsInAscendingOrder(Song so[], String artist){
        Song ans[] = new Song[0];
        for(int i=0 ; i<so.length ;i++){
            if(so[i].getartist().equalsIgnoreCase(artist)){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = so[i];
            }
        }
        if(ans !=null){
            for(int i=0 ; i<ans.length-1 ; i++){
                for(int j=i+1 ; j<ans.length ; j++){
                    if(ans[i].getduration()>ans[j].getduration()){
                        Song temp = ans[i];
                        ans[i] = ans[j];
                        ans[j] = temp;
                    }
                }
            }
            return ans;
        }
        return null;        

    }
    public static double findSongDurationForArtist(Song so[], String artist){
        double sum = 0;
        for(int i=0 ; i<so.length ; i++){
            if(so[i].getartist().equalsIgnoreCase(artist)){
                sum += so[i].getduration();
            }
        }
        return sum;
    }
}