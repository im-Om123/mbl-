package Model;

public class MyData {
    private String title;
    private String desc;
    int image;
    public MyData (String title, String address, int image){
        this.title=title;
        this.desc=desc;
        this.image=image;
    }
    public String getTitle(){
        return title;
    }
    public String getDesc(){
        return desc;
    }
    public int getImage(){
        return image;
    }
}
