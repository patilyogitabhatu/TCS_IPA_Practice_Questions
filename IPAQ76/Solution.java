import java.util.*;
class Document{
    private int id, pages;
    private String title, folderName;

    public Document(int id, String title, String folderName, int pages){
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
    }
    public int getid(){
        return id;
    }
    public String gettitle(){
        return title;
    }
    public String getfoldername(){
        return folderName;
    }
    public int getpages(){
        return pages;
    }
}
public class Solution{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Document doc[] = new Document[4];
        for(int i=0 ; i<4 ; i++){
            int a = s.nextInt(); s.nextLine();
            String b = s.nextLine();
            String c = s.nextLine();
            int d = s.nextInt(); s.nextLine();

            doc[i] = new Document(a, b, c, d);
        }
        Document ans[] =docsWithOddPages(doc);
        if(ans != null){
            for(int i=0 ; i<ans.length ;i++){
                for(int j=i+1 ; j<ans.length ; j++){
                    if(ans[i].getid()>ans[j].getid()){
                        Document temp = ans[i];
                        ans[i] = ans[j];
                        ans[j] = temp;
                    }
                }
            }

            for(int i=0 ; i<ans.length ;i++){
                System.out.println(ans[i].getid()+" "+ans[i].gettitle()+" "+ans[i].getfoldername()+" "+ans[i].getpages());
            }
        }
    }
    public static Document[] docsWithOddPages(Document doc[]){
        Document ans[] = new Document[0];
        for(int i=0 ; i<doc.length ;i++){
            if(doc[i].getpages()%2 !=0){
                ans = Arrays.copyOf(ans, ans.length+1);
                ans[ans.length-1] = doc[i];
            }
        }
        return ans;
    }
}