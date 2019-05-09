package com.example.eatsnow;

public class Collection {
    private int collection_id;
    private String title;
    private String url;
    private String discription;
    private String image_url;
    private int res_count;
    private String share_url;

    public Collection(int collection_id,String title,String url, String discription, String image_url,int res_count, String share_url){
        this.collection_id = collection_id;
        this.title = title;
        this.url = url;
        this.discription = discription;
        this.image_url = image_url;
        this.res_count = res_count;
        this.share_url = share_url;
    }

    //Getter functions
    public int getCollection_id(){
        return collection_id;
    }

    public String getTitle(){
        return title;
    }

    public String getUrl(){
        return url;
    }

    public String getDiscription(){
        return discription;
    }

    public String getImage_url(){
        return image_url;
    }

    public int getRes_count(){
        return res_count;
    }

    public String getShare_url() {
        return share_url;
    }
}